package com.tymkovskiy.pivot_table.controller;

import com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject;
import com.tymkovskiy.pivot_table.service.ParametersValidator;
import com.tymkovskiy.pivot_table.service.SourceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TwoDimensionalResponseObjectRestController {

    private SourceDataService service;
    private ParametersValidator validator;

    @Autowired
    public void setService(SourceDataService service) {
        this.service = service;
    }

    @Autowired
    public void setValidator(ParametersValidator validator) {
        this.validator = validator;
    }

    @GetMapping
    public List<TwoDimensionalResponseObject> getTwoDimensionalTableWithAggregationFunction(
            @RequestParam(value = "row") String row,
            @RequestParam(value = "col") String col,
            @RequestParam(value = "aggr", required = false, defaultValue = "sum") String aggr
    ) {
        if (!validator.isValidParameters(row, col, aggr)) {
            throw new IllegalArgumentException("Illegal request parameter! " + validator.getValidParameters());
        }
        return service.getTwoDimensionalTableWithAggregationFunction(row, col, aggr);
    }
}
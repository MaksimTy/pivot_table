package com.tymkovskiy.pivot_table.service;

import com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject;
import com.tymkovskiy.pivot_table.repos.SourceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SourceDataService implements ISourceDataService {

    private SourceDataRepository repository;

    @Autowired
    public void setRepository(SourceDataRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public List<TwoDimensionalResponseObject> getTwoDimensionalTableWithAggregationFunction(String row, String col, String aggr) {
        return repository.getTwoDimensionalTableWithAggregationFunction(row, col, aggr);
    }
}
package com.tymkovskiy.pivot_table.service;

import com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject;

import java.util.List;

public interface ISourceDataService {

    List<TwoDimensionalResponseObject> getTwoDimensionalTableWithAggregationFunction(String row, String col, String aggr);
}
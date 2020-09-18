package com.tymkovskiy.pivot_table.repos;

import com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject;

import java.util.List;

public interface TwoDimensionalTableRepository<T> {

    List<TwoDimensionalResponseObject> getTwoDimensionalTableWithAggregationFunction(String row,
                                                                                     String col,
                                                                                     String aggr);
}

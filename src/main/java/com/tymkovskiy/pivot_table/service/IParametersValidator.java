package com.tymkovskiy.pivot_table.service;

public interface IParametersValidator {

    String getValidParameters();

    boolean isRowNameValid(String row);

    boolean isColNameValid(String col);

    boolean isAggrFunctionValid(String aggr);

    boolean isValidParameters(String row, String col, String aggr);
}

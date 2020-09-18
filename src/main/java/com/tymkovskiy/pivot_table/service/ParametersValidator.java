package com.tymkovskiy.pivot_table.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ParametersValidator implements IParametersValidator {

    private final String [] rowAndColNames = {"a", "b", "c", "d", "y"};
    private final String [] functionsName = {"sum", "count", "min", "max", "avg"};

    @Override
    public String getValidParameters() {
        StringBuilder builder = new StringBuilder();
        builder.append("Rows and cols valid names are : ");
        builder.append(Arrays.toString(rowAndColNames)).append(", ");
        builder.append("functions valid names are : ");
        builder.append(Arrays.toString(functionsName)).append("!");
        return builder.toString();
    }

    @Override
    public boolean isRowNameValid(String row) {
        return Arrays.asList(this.rowAndColNames).contains(row);
    }

    @Override
    public boolean isColNameValid(String col) {
        return Arrays.asList(this.rowAndColNames).contains(col);
    }

    @Override
    public boolean isAggrFunctionValid(String aggr) {
        return Arrays.asList(this.functionsName).contains(aggr);
    }

    @Override
    public boolean isValidParameters(String row, String col, String aggr) {
        return this.isRowNameValid(row) && this.isColNameValid(col) && this.isAggrFunctionValid(aggr);
    }
}

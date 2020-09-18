package com.tymkovskiy.pivot_table.repos;

import com.tymkovskiy.pivot_table.model.SourceData;
import com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class TwoDimensionalTableRepositoryImpl implements TwoDimensionalTableRepository<SourceData> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<TwoDimensionalResponseObject> getTwoDimensionalTableWithAggregationFunction(
            String row,
            String col,
            String aggr) {

        String queryString = String.format(
                "SELECT new com.tymkovskiy.pivot_table.model.TwoDimensionalResponseObject(t.%1$s, t.%2$s, %3$s(t.v)) " +
                        "FROM SourceData t " +
                        "GROUP BY t.%1$s, t.%2$s", row, col, aggr);

        return entityManager.createQuery(queryString).getResultList();
    }
}

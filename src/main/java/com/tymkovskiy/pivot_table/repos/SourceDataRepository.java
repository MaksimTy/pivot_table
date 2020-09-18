package com.tymkovskiy.pivot_table.repos;

import com.tymkovskiy.pivot_table.model.SourceData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceDataRepository
        extends
        CrudRepository<SourceData, Integer>,
        TwoDimensionalTableRepository<SourceData> {

}

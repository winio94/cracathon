package com.cracathon.repository;

import com.cracathon.domain.Measurement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Michał on 2016-12-09.
 */
@Repository
public interface MeasurementRepository extends CrudRepository<Measurement, Long> {
}

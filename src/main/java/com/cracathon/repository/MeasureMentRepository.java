package com.cracathon.repository;

import com.cracathon.domain.Measurement;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michał on 2016-12-09.
 */
public interface MeasureMentRepository extends CrudRepository<Measurement, Long> {
}

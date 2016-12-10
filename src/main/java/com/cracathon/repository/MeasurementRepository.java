package com.cracathon.repository;

import com.cracathon.domain.Measurement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Michał on 2016-12-09.
 */
public interface MeasurementRepository extends CrudRepository<Measurement, Long> {

    @Query("SELECT m FROM Measurement m WHERE m.person.id = :person AND m.measureDate BETWEEN :start AND :end")
    List<Measurement> findAllByPersonIdAndMeasureDateBetween(@Param("person") Long person,
                                                             @Param("start") LocalDateTime start,
                                                             @Param("end") LocalDateTime end);

}

package com.cracathon.repository;

import com.cracathon.domain.Pressure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michał on 2016-12-09.
 */
public interface PressureRepository extends CrudRepository<Pressure, Long> {
}

package com.cracathon.repository;

import com.cracathon.domain.BackPressure;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michał on 2016-12-09.
 */
public interface BackPressureRepository extends CrudRepository<BackPressure, Long> {
}
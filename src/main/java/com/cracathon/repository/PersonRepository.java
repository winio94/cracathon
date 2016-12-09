package com.cracathon.repository;

import com.cracathon.domain.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Michał on 2016-12-09.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
}

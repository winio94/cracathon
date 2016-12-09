package com.cracathon.service;

import com.cracathon.domain.Person;
import com.cracathon.repository.PersonRepository;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Michał on 2016-12-09.
 */
@Named
public class InitializationService {

    private static final int PERSON_AMOUNT = 20;

    @Inject
    private PersonRepository personRepository;

    @PostConstruct
    public void postConstruct() {
        for (int i = 0; i < PERSON_AMOUNT; i++) {
            Person person = new Person();
            person.setPersonId("code" + i);
            personRepository.save(person);
        }
    }
}
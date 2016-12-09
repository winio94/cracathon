package com.cracathon.service;

import com.cracathon.domain.*;
import com.cracathon.repository.*;
import org.springframework.scheduling.annotation.Scheduled;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;
import java.util.Random;

/**
 * Created by Michał on 2016-12-09.
 */
@Named
public class MeasurementProvider {

    private static final Integer MAX_LUMENS = 1000;
    private static final int MAX_NOISE = 50;
    private static final int MAX_TEMPERATURE = 30;
    private static final Integer MAX_PRESSURE = 100;
    private Random random = new Random();

    @Inject
    private MeasurementRepository measurementRepository;

    @Inject
    private PersonRepository personRepository;

    @Inject
    private PressureRepository pressureRepository;

    @Inject
    private BackPressureRepository backPressureRepository;

    @Inject
    private BottomPressureRepository bottomPressureRepository;

    @Scheduled(fixedRate = 10000)
    public void generateMeasurement() {
        Iterable<Person> persons = personRepository.findAll();
        for (Person person : persons) {
            Measurement measurement = createMeasurement(person, random);
            BackPressure backPressure = createBackPressure();
            BottomPressure bottomPressure = createBottomPressure();
            Pressure pressure = new Pressure();
            backPressureRepository.save(backPressure);
            pressure.setBack(backPressure);
            bottomPressureRepository.save(bottomPressure);
            pressure.setBack(backPressure);
            pressure.setBottom(bottomPressure);
            pressureRepository.save(pressure);

            measurement.setPressure(pressure);
            measurement.setMeasureDate(new Date());
            measurementRepository.save(measurement);
        }
    }

    private BottomPressure createBottomPressure() {
        BottomPressure bottomPressure = new BottomPressure();
        bottomPressure.setBack(random.nextDouble() * MAX_PRESSURE);
        bottomPressure.setFront(random.nextDouble() * MAX_PRESSURE);
        return bottomPressure;
    }

    private BackPressure createBackPressure() {
        BackPressure backPressure = new BackPressure();
        backPressure.setBottom(random.nextDouble() * MAX_PRESSURE);
        backPressure.setTop(random.nextDouble() * MAX_PRESSURE);
        return backPressure;
    }

    private Measurement createMeasurement(Person p, Random random) {
        Measurement measurement = new Measurement();
        measurement.setLight(random.nextInt(MAX_LUMENS));
        measurement.setNoise(random.nextInt(MAX_NOISE));
        measurement.setPerson(p);
        measurement.setTemperature(random.nextInt(MAX_TEMPERATURE));
        return measurement;
    }
}

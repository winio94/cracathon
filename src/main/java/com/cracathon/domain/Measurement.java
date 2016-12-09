package com.cracathon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by Michał on 2016-12-09.
 */
@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double temperature;

    @NotNull
    private Double light;

    @NotNull
    private Double noise;

    @NotNull
    private Pressure pressure;
}

package com.cracathon.domain;

import br.com.otavio.jpa.javatime.PersistentLocalDateTime;
import com.cracathon.converter.LocalDateConverter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Created by Michał on 2016-12-09.
 */
@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Integer temperature;

    @NotNull
    private Integer light;

    @NotNull
    private Integer noise;

    @ManyToOne
    @JoinColumn
    private Person person;

    @NotNull
    @OneToOne
    private Pressure pressure;

    @NotNull
    @Convert(converter=PersistentLocalDateTime.class)
    private LocalDateTime measureDate;

    private Double weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getLight() {
        return light;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public Integer getNoise() {
        return noise;
    }

    public void setNoise(Integer noise) {
        this.noise = noise;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public void setPressure(Pressure pressure) {
        this.pressure = pressure;
    }

    public LocalDateTime getMeasureDate() {
        return measureDate;
    }

    public void setMeasureDate(LocalDateTime measureDate) {
        this.measureDate = measureDate;
    }
}

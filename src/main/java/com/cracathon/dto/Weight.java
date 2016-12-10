package com.cracathon.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
public class Weight {

    private Double value;

    @JsonFormat(pattern = "dd-MM-yyyy hh:mm")
    private LocalDateTime date;

    public Weight(Double value, LocalDateTime date) {
        this.value = value;
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", date=" + date +
                '}';
    }
}

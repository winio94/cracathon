package com.cracathon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Michał on 2016-12-09.
 */

@Entity
public class BackPressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double top;
    private Double bottom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    public Double getBottom() {
        return bottom;
    }

    public void setBottom(Double bottom) {
        this.bottom = bottom;
    }
}
package com.cracathon.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Michał on 2016-12-09.
 */
@Entity
public class Pressure {

    @Id
    private Long id;

    @OneToOne
    private BottomPressure bottom;

    @OneToOne
    private BackPressure back;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BottomPressure getBottom() {
        return bottom;
    }

    public void setBottom(BottomPressure bottom) {
        this.bottom = bottom;
    }

    public BackPressure getBack() {
        return back;
    }

    public void setBack(BackPressure back) {
        this.back = back;
    }
}
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

    private BackPressure back;


}

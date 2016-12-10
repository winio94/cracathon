package com.cracathon.dto;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
public class Position {

    private String name;
    private Integer percent;
    private Integer tendency;

    public Position(String name, Integer percent, Integer tendency) {
        this.name = name;
        this.percent = percent;
        this.tendency = tendency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Integer getTendency() {
        return tendency;
    }

    public void setTendency(Integer tendency) {
        this.tendency = tendency;
    }

    @Override
    public String toString() {
        return "Position{" +
                "name='" + name + '\'' +
                ", percent=" + percent +
                ", tendency=" + tendency +
                '}';
    }
}

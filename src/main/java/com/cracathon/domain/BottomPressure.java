package com.cracathon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Michał on 2016-12-09.
 */

@Entity
public class BottomPressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double front;
    private Double back;
    private Double left;
    private Double right;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getFront() {
        return front;
    }

    public void setFront(Double front) {
        this.front = front;
    }

    public Double getBack() {
        return back;
    }

    public void setBack(Double back) {
        this.back = back;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }
}
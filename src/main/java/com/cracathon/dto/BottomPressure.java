package com.cracathon.dto;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
public class BottomPressure {

    private Double front;
    private Double back;
    private Double left;
    private Double right;

    private Double changeTendencyFront;
    private Double changeTendencyBack;
    private Double changeTendencyLeft;
    private Double changeTendencyRight;

    public BottomPressure(Double front, Double back, Double left, Double right, Double changeTendencyFront, Double changeTendencyBack, Double changeTendencyLeft, Double changeTendencyRight) {
        this.front = front;
        this.back = back;
        this.left = left;
        this.right = right;
        this.changeTendencyFront = changeTendencyFront;
        this.changeTendencyBack = changeTendencyBack;
        this.changeTendencyLeft = changeTendencyLeft;
        this.changeTendencyRight = changeTendencyRight;
    }

    public Double getChangeTendencyFront() {
        return changeTendencyFront;
    }

    public void setChangeTendencyFront(Double changeTendencyFront) {
        this.changeTendencyFront = changeTendencyFront;
    }

    public Double getChangeTendencyBack() {
        return changeTendencyBack;
    }

    public void setChangeTendencyBack(Double changeTendencyBack) {
        this.changeTendencyBack = changeTendencyBack;
    }

    public Double getChangeTendencyLeft() {
        return changeTendencyLeft;
    }

    public void setChangeTendencyLeft(Double changeTendencyLeft) {
        this.changeTendencyLeft = changeTendencyLeft;
    }

    public Double getChangeTendencyRight() {
        return changeTendencyRight;
    }

    public void setChangeTendencyRight(Double changeTendencyRight) {
        this.changeTendencyRight = changeTendencyRight;
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
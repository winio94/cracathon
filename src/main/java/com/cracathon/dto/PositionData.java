package com.cracathon.dto;

/**
 * Created by Mateusz Brycki on 09/12/2016.
 */
public class PositionData {

    private Double good;
    private Double bad;

    private PositionData(Double good, Double bad) {
        this.good = good;
        this.bad = bad;
    }

    public Double getGood() {
        return good;
    }

    public Double getBad() {
        return bad;
    }

    @Override
    public String toString() {
        return "PositionData{" +
                "good=" + good +
                ", bad=" + bad +
                '}';
    }

    public static class Builder {
        private Double good;
        private Double bad;

        public Builder() {}

        public Builder withGood(Double good) {
            this.good = good;
            return this;
        }

        public Builder withBad(Double bad) {
            this.bad = bad;
            return this;
        }

        public PositionData build() {
            return new PositionData(good, bad);
        }

    }
}

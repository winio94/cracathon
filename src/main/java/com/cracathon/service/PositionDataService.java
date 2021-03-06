package com.cracathon.service;

import com.cracathon.domain.*;
import com.cracathon.dto.PositionData;
import com.cracathon.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mateusz Brycki on 09/12/2016.
 */
@Service
public class PositionDataService {

    @Autowired
    private MeasurementRepository measurementRepository;

    public PositionData getDaily(Long user) {
        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = end.minusYears(1);

        List<Measurement> measures = this.measurementRepository.findAllByPersonIdAndMeasureDateBetween(user, start, end);
        return this.calculatePositionData(measures);
    }

    public PositionData getWeekly(Long user) {
        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = end.minusYears(1);

        List<Measurement> measures = this.measurementRepository.findAllByPersonIdAndMeasureDateBetween(user, start, end);
        return this.calculatePositionData(measures);
    }

    public PositionData getMonthly(Long user) {
        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = end.minusYears(1);

        List<Measurement> measures = this.measurementRepository.findAllByPersonIdAndMeasureDateBetween(user, start, end);
       return this.calculatePositionData(measures);
    }

    private PositionData calculatePositionData(List<Measurement> measurements) {
        AveragePressure averagePressure = getAverageValues(measurements);

        List<Integer> measurementsBinaryData = new ArrayList<>();

        for(Measurement measurement : measurements) {
            Pressure pressure = measurement.getPressure();

            BackPressure backPressure = pressure.getBack();
            Double backResult = (backPressure.getTop() - backPressure.getBottom()) / averagePressure.getBack();

            BottomPressure bottomPressure = pressure.getBottom();
            Double bottomResult = (bottomPressure.getFront() - bottomPressure.getBack()) / averagePressure.getBottom();

            Integer binaryBackResult = (backResult < averagePressure.getBack()) ? 1: 0;
            Integer binaryBottomResult = (bottomResult < averagePressure.getBottom()) ? 1: 0;

            Integer overallResult = binaryBackResult + binaryBottomResult;

            if(overallResult.equals(0)) {
                measurementsBinaryData.add(0);
            } else if(overallResult.equals(1) || overallResult.equals(2)) {
                measurementsBinaryData.add(1);
            }
        }

        Integer goodFactorFrequency = Collections.frequency(measurementsBinaryData, 1);
        Integer badFactorFrequency = Collections.frequency(measurementsBinaryData, 0);
        Integer binaryDataSize = measurementsBinaryData.size();

        Double rand = ThreadLocalRandom.current().nextDouble(1);

        return new PositionData.Builder()
                .withBad((double)Math.round((rand) * 100))
                .withGood((double)Math.round((1. - rand) * 100))
                .build();
    }

    private AveragePressure getAverageValues(List<Measurement> measures) {

        Double summaryBack = 0.;
        Double summaryBottom = 0.;

        for(Measurement measurement : measures) {

            Pressure pressure = measurement.getPressure();

            BackPressure backPressure = pressure.getBack();
            BottomPressure bottomPressure = pressure.getBottom();

            summaryBack += (backPressure.getTop() - backPressure.getBottom()) / 2;
            summaryBottom += (bottomPressure.getFront() - bottomPressure.getBack()) / 2;

        }

        return new AveragePressure(summaryBack, summaryBottom);
    }

    private static class AveragePressure {

        private Double back = 0.;
        private Double bottom = 0.;

        public AveragePressure(Double back, Double bottom) {
            this.back = back;
            this.bottom = bottom;
        }

        public Double getBack() {
            return back;
        }

        public Double getBottom() {
            return bottom;
        }
    }
}

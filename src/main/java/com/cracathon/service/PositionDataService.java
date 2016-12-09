package com.cracathon.service;

import com.cracathon.domain.Measurement;
import com.cracathon.domain.Person;
import com.cracathon.dto.PositionData;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Mateusz Brycki on 09/12/2016.
 */
@Service
public class PositionDataService {

    public PositionData getDaily(Person person) {
        return new PositionData.Builder()
                .withBad(0.9)
                .withGood(0.1)
                .build();
    }

    public PositionData getWeekly(Person person) {
        return new PositionData.Builder()
                .withBad(0.9)
                .withGood(0.1)
                .build();
    }

    public PositionData getMonthly(Person person) {
        return new PositionData.Builder()
                .withBad(0.9)
                .withGood(0.1)
                .build();
    }

    private PositionData getAverageValues(List<Measurement> measures) {

        Double summaryBack = 0D;
        Double summaryBottom = 0D;

        measures.forEach(measurement -> {
        });

        return new PositionData.Builder()
                .withBad(0.9)
                .withGood(0.1)
                .build();
    }
}

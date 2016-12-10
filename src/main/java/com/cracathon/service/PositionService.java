package com.cracathon.service;

import com.cracathon.dto.Position;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@Service
public class PositionService {

    public List<Position> generatePositions() {
        List<Position> result = new ArrayList<>();

        Integer goodPercentage = ThreadLocalRandom.current().nextInt(100);
        Integer betterPercentage = ThreadLocalRandom.current().nextInt(100 - goodPercentage);
        Integer badPercentage = 100 - (goodPercentage + betterPercentage);

        Integer goodTendency = ThreadLocalRandom.current().nextInt(5);
        Integer betterTendency = ThreadLocalRandom.current().nextInt(5);
        Integer badTendency = ThreadLocalRandom.current().nextInt(5);

        result.add(new Position("good", goodPercentage, goodTendency));
        result.add(new Position("average", betterPercentage, betterTendency));
        result.add(new Position("bad", badPercentage, badTendency));

        return result;
    }
}

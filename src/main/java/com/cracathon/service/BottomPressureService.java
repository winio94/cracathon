package com.cracathon.service;

import com.cracathon.dto.BottomPressure;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@Service
public class BottomPressureService {

    public BottomPressure getBottomPressureForUser(Long user) {

        Double front = ThreadLocalRandom.current().nextDouble(100),
                back = ThreadLocalRandom.current().nextDouble(100),
                left = ThreadLocalRandom.current().nextDouble(100),
                right = ThreadLocalRandom.current().nextDouble(100);

        Double changeTendencyFront = ThreadLocalRandom.current().nextDouble(1),
               changeTendencyBack = ThreadLocalRandom.current().nextDouble(1),
               changeTendencyLeft = ThreadLocalRandom.current().nextDouble(1),
               changeTendencyRight = ThreadLocalRandom.current().nextDouble(1);

        BottomPressure bottomPressure = new BottomPressure(
                front, back,left, right,
                changeTendencyFront, changeTendencyBack, changeTendencyLeft, changeTendencyRight
        );

        return bottomPressure;
    }
}

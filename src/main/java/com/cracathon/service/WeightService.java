package com.cracathon.service;

import com.cracathon.dto.Weight;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@Service
public class WeightService {


    public List<Weight> getWeightListForUser(Long user) {
        List<Weight> result = new ArrayList<>();
        LocalDateTime date = LocalDateTime.now();
        Double rand = ThreadLocalRandom.current().nextDouble(60, 100);

        Double delta = ThreadLocalRandom.current().nextDouble(2, 8);
        delta = delta / 10;


        for(int i = 0; i < 30; i++) {

            Double value = 0D;
            if((ThreadLocalRandom.current().nextInt(2)) == 1) {
                rand = rand + delta;
            } else {
                rand = rand - delta;
            }

            result.add(new Weight(rand, date.minusDays(30-i)));
        }

        return result;
    }
}

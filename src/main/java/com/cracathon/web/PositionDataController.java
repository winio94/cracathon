package com.cracathon.web;

import com.cracathon.dto.PositionData;
import com.cracathon.service.PositionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mateusz Brycki on 09/12/2016.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/positiondata")
public class PositionDataController {

    @Autowired
    private PositionDataService positionDataService;

    @GetMapping
    public Map<String, PositionData> returnPositionData(@RequestParam("user") Long userId) {

        Map<String, PositionData> result = new HashMap<>();

        result.put("daily", positionDataService.getDaily(userId));
        result.put("weekly", positionDataService.getWeekly(userId));
        result.put("monthly", positionDataService.getMonthly(userId));

        return result;
    }
}

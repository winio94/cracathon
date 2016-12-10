package com.cracathon.web;

import com.cracathon.dto.Weight;
import com.cracathon.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@RestController
@RequestMapping(path = "/weight")
public class WeightController {

    @Autowired
    private WeightService weightService;

    @GetMapping
    public List<Weight> weightList(@RequestParam("user") Long user) {

        return weightService.getWeightListForUser(user);
    }
}

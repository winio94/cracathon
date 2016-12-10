package com.cracathon.web;

import com.cracathon.dto.Weight;
import com.cracathon.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@CrossOrigin(origins = "*")
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

package com.cracathon.web;

import com.cracathon.dto.BottomPressure;
import com.cracathon.service.BottomPressureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/bottomPressure")
public class BottomPressureController {

    @Autowired
    private BottomPressureService bottomPressureService;

    @GetMapping
    public BottomPressure getBottomPressure(@RequestParam("user") Long user) {

        return this.bottomPressureService.getBottomPressureForUser(user);

    }

}

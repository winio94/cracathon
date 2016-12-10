package com.cracathon.web;

import com.cracathon.dto.Position;
import com.cracathon.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz Brycki on 10/12/2016.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping
    public List<Position> getPositions() {
        return positionService.generatePositions();
    }

}

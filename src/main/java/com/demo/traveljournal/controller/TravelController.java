package com.demo.traveljournal.controller;

import com.demo.traveljournal.data.TripRepository;
import com.demo.traveljournal.model.Trip;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class TravelController {

    private final TripRepository repository;

    TravelController(TripRepository repository) {
        this.repository = repository;
    }

    //endpoint to add a trip to the database (Request body)

    //endpoint to retrieve all trips from the database

    //endpoint to rename the season for a specific trip (2 Path params - find by id, new name)

    //endpoint to delete a trip from the repository by id (1 path variable)
}

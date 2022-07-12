package com.demo.traveljournal.data;

import com.demo.traveljournal.model.Trip;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripRepository extends MongoRepository<Trip, Long> {
}

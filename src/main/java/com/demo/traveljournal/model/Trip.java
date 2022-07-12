package com.demo.traveljournal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("Trips")
public class Trip {

    @Id @Generated @JsonProperty("id")
    private Long tripId;
    private String locationName;
    private String season;
    private int totalDays;
    private String beautifulPhotoURL;
}

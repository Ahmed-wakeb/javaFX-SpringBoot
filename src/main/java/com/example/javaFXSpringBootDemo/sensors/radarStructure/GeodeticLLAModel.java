package com.example.javaFXSpringBootDemo.sensors.radarStructure;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@AllArgsConstructor @NoArgsConstructor @Data
public class GeodeticLLAModel {
    private Double lat;
    private Double lon;
    private Double alt;

//    public GeodeticLLAModel(Double lat, Double lon, Double alt) {
//        this.lat = lat;
//        this.lon = lon;
//        this.alt = alt;
////        return location(lat,lon,alt);
//    }

}

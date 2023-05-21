package com.example.javaFXSpringBootDemo.sensors.radarStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Calculate {
    private Double lat;
    private Double lon;
    private Double alt;


    public Double calculateLocation(){
        return this.lat+this.lon+this.alt;
    }

}

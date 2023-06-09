package com.example.javaFXSpringBootDemo.sensors.radarStructure;

import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrackParameters {
    private int id;
    private LocalDate time;
    @Embedded
    private GeodeticLLAModel geodeticLLAModel;
    @Embedded
    private GeodeticSpeedModel geodeticSpeedModel;
    private char[] militarySymbol = new char[20];
    int radarId;
    double v1;
    double v2;
    double p_v1;
    double p_v2;
    double rcs;
    int type;
}


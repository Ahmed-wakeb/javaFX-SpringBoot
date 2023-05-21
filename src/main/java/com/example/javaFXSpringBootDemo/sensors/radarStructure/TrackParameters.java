package com.example.javaFXSpringBootDemo.sensors.radarStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyRadarModel {
    private int id;
    private Date time;

    private GeodeticLLAModel geodeticLLAModel;
    private GeodeticSpeedModel geodeticSpeedModel;
    private char militarySymbol[];
    int radarId;
    double v1;
    double v2;
    double p_v1;
    double p_v2;
    double rcs;
    int type;
}


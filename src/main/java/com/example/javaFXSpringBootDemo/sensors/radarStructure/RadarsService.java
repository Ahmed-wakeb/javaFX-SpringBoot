package com.example.javaFXSpringBootDemo.sensors.radarStructure;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K.Radar10K;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RadarsService {
    public TrackParameters convertData(Radar10K radar10K) {

        TrackParameters trackParameters = new TrackParameters();
        trackParameters.setId(1);
        trackParameters.setTime(LocalDate.now());
        trackParameters.setGeodeticLLAModel(new GeodeticLLAModel(radar10K.getLatitude(), radar10K.getLongitude(), radar10K.getAltitude()));
        trackParameters.setGeodeticSpeedModel(new GeodeticSpeedModel());
        trackParameters.setMilitarySymbol(null);
        trackParameters.setRadarId(radar10K.getRadar_id());
        trackParameters.setV1(0);
        trackParameters.setV2(0);
        trackParameters.setP_v1(0);
        trackParameters.setP_v2(0);
        trackParameters.setType(2);
//        trackParameters.setLocation(new Calculate().calculateLocation(
//                radar10K.getLatitude(),
//                radar10K.getLongitude(),
//                radar10K.getAltitude()));

        return trackParameters;
    }
}

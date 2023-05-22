package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SensorService {

    private final SensorsClassifiedTrackParametersRepo classifiedRepo;


    public String convertDataFromClassifiedTrackParmeterToTrackType(TrackParameters trackParameters) {
       SensorsClassifiedTrackParameters classifiedTrackParameters = new SensorsClassifiedTrackParameters
                ("1",trackParameters,
                        null,
                        5,
                        null,
                        null);
       classifiedRepo.save(classifiedTrackParameters);

        return "Data add to database !!";
    }

    public List<SensorsClassifiedTrackParameters> getDataFromDB() {

        return classifiedRepo.findAll();
    }
}

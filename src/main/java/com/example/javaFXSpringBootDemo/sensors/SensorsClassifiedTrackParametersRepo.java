package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorsClassifiedTrackParametersRepo extends JpaRepository<SensorsClassifiedTrackParameters,String> {
}

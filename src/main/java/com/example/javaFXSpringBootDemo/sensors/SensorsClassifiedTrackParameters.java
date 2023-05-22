package com.example.javaFXSpringBootDemo.sensors;

import com.example.javaFXSpringBootDemo.sensors.radarStructure.TrackParameters;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity
public class SensorsClassifiedTrackParameters {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(insertable = false, updatable = false)
    private String ClassifiedId;
    @Embedded
    private TrackParameters trackParameters;
    private Boolean fireAuthorization;
    private int timeToArrive;
    @Embedded
    private TrackType type;
    private Boolean trackTypeOverwritten;


}

package com.example.javaFXSpringBootDemo.sensors.radarStructure.radar10K;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@Controller
public class Radar10KController {
    public Radar10K addData(){
        return new Radar10K(22,"Radar10K",25.5,25.5,22.4);
    }

    public Radar10K sendData(){
        return addData();

    }

    public void sayHello(String hiFromUi) {
        System.out.println(hiFromUi);
    }
}

package com.example.javaFXSpringBootDemo.testDB;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepo modelRepo;
    public String addModel(ModelDB modelBuilder) {
        modelRepo.save(modelBuilder);
        return "The Data save to Database";
    }

    public List<ModelDB> getData() {
        return modelRepo.findAll();
    }
}

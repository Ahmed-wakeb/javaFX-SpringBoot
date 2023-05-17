package com.example.javaFXSpringBootDemo.testDB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor @Data
@Entity
@Builder
public class ModelDB {
    @Id
    private String id;
    private String userName;
    private String password;
    private String email;
}

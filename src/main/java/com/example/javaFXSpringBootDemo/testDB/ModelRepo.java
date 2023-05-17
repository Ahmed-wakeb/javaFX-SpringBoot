package com.example.javaFXSpringBootDemo.testDB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepo extends JpaRepository<ModelDB,String> {
}

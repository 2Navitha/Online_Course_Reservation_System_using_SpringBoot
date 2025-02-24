package com.example.courseRegisterSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity

public class CourseRegistry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;// no need to provide value
    private String name;
    private String emailId;
    private String courseName;

    public CourseRegistry(String emailId, String name, String courseName) {
        this.emailId = emailId;
        this.name = name;
        this.courseName = courseName;
    }

    public CourseRegistry() {
    }
}

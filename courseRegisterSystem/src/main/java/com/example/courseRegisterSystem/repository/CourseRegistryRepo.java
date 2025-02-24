package com.example.courseRegisterSystem.repository;

import com.example.courseRegisterSystem.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}

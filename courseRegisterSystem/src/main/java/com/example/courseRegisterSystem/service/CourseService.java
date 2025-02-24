package com.example.courseRegisterSystem.service;

import com.example.courseRegisterSystem.model.Course;
import com.example.courseRegisterSystem.model.CourseRegistry;
import com.example.courseRegisterSystem.repository.CourseRegistryRepo;
import com.example.courseRegisterSystem.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> availableCourses() {
        return courseRepo.findAll();

    }

    public List<CourseRegistry> entrolledStudents() {
        return courseRegistryRepo.findAll();

    }

    public void enrollCourse(String name, String emailId, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name, emailId, courseName);
        courseRegistryRepo.save(courseRegistry);
    }
}

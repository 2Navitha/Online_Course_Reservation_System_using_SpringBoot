package com.example.courseRegisterSystem.controller;

import com.example.courseRegisterSystem.model.Course;
import com.example.courseRegisterSystem.model.CourseRegistry;
import com.example.courseRegisterSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> availableCourses(){
      return courseService.availableCourses();

    }
    @GetMapping("/courses/entrolled")
    public List<CourseRegistry> entrolledStudents(){
        return  courseService.entrolledStudents();
    }
    @PostMapping("courses/register")
    public String entrollCourse(@RequestParam ("name") String name,
                                @RequestParam ("emailId") String emailId,
                                @RequestParam ("courseName") String courseName){
         courseService.enrollCourse(name, emailId, courseName);
         return "Congratulations! "+name+" entrolled successful for "+courseName;
    }
}

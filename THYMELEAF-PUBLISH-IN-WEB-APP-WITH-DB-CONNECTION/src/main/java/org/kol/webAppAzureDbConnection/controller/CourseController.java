package org.kol.webAppAzureDbConnection.controller;

import org.kol.webAppAzureDbConnection.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public String getAllCourses(Model model) {
        // Fetch all courses from the database
        model.addAttribute("courses", courseRepository.findAll());
        return "Home";  // Thymeleaf template name (home.html)
    }
}
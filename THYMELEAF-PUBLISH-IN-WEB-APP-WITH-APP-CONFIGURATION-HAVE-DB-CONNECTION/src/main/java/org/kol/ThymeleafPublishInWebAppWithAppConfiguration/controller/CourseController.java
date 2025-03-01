package org.kol.ThymeleafPublishInWebAppWithAppConfiguration.controller;


import org.kol.ThymeleafPublishInWebAppWithAppConfiguration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
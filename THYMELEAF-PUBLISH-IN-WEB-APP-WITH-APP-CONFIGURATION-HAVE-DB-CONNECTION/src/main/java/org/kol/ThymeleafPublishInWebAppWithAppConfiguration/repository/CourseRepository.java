package org.kol.ThymeleafPublishInWebAppWithAppConfiguration.repository;


import org.kol.ThymeleafPublishInWebAppWithAppConfiguration.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // You can define custom queries here if needed
}
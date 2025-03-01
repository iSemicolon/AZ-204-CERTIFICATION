package org.kol.webAppHaveAzureDbConnection.repository;


import org.kol.webAppHaveAzureDbConnection.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // You can define custom queries here if needed
}
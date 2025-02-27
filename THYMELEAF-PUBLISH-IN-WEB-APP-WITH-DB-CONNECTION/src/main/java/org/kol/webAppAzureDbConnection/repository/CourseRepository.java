package org.kol.webAppAzureDbConnection.repository;

import org.kol.webAppAzureDbConnection.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    // You can define custom queries here if needed
}
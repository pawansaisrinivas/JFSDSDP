package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

// Ensure StudentCourse is a valid @Entity with a primary key of type String
public interface ScInterface extends JpaRepository<StudentCourse, String> {
}

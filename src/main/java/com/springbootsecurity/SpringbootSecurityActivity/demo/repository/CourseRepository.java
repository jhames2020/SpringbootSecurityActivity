package com.springbootsecurity.SpringbootSecurityActivity.demo.repository;

import com.springbootsecurity.SpringbootSecurityActivity.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}


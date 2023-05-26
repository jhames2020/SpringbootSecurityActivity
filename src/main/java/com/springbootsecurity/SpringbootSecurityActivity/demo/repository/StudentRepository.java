package com.springbootsecurity.SpringbootSecurityActivity.demo.repository;

import com.springbootsecurity.SpringbootSecurityActivity.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}

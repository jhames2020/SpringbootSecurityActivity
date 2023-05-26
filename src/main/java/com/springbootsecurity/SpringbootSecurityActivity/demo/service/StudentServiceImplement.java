package com.springbootsecurity.SpringbootSecurityActivity.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootsecurity.SpringbootSecurityActivity.demo.model.Course;
import com.springbootsecurity.SpringbootSecurityActivity.demo.model.Student;
import com.springbootsecurity.SpringbootSecurityActivity.demo.repository.StudentRepository;

@Service
public class StudentServiceImplement implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student updateById(Long id, Student updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setFirstName(updatedStudent.getFirstName());
        student.setLastName(updatedStudent.getLastName());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());
        student.setGpa(updatedStudent.getGpa());
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {

        studentRepository.deleteById(id);
    }

    @Override
    public Student enroll(Long id, Course course){
        Student student = studentRepository.findById(id).orElseThrow();
        student.setCourse(course);
        return studentRepository.save(student);
    }

    @Override
    public Student drop(Long id, Course course){
        Student student = studentRepository.findById(id).orElseThrow();
        student.setCourse(null);
        return studentRepository.save(student);
    }
}
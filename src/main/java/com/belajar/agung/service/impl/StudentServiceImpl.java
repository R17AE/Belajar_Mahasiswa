/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.agung.service.impl;

import com.belajar.agung.domain.Student;
import com.belajar.agung.repository.StudentRepository;
import com.belajar.agung.service.StudentService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author user
 */

@Service
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    
    
    @Transactional
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Transactional
    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Transactional
    @Override
    public void delete(String id) {
        studentRepository.delete(id);
    }

    @Override
    public Optional<Student> getStudent(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public Iterable<Student> getStudents() {
        return studentRepository.findAll();
    }

   
}

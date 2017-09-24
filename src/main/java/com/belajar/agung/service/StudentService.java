/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.agung.service;

import com.belajar.agung.domain.Student;
import java.util.Optional;


/**
 *
 * @author user
 */
public interface StudentService {
    
    public void save(Student student);
    
    public void update(Student student);
    
    public void delete(String id);
    
    Optional<Student> getStudent(String id);
    
    Iterable<Student> getStudents();
    
}

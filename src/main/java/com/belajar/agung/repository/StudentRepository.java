/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.agung.repository;

import com.belajar.agung.domain.Student;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author user
 */
public interface StudentRepository extends PagingAndSortingRepository<Student, String> {
    Optional<Student> findById(String id);
   
    
    
}

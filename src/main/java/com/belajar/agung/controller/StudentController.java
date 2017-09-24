/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.agung.controller;

import com.belajar.agung.domain.Student;
import com.belajar.agung.service.StudentService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author user
 */
@RestController
@RequestMapping(value = "/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    @GetMapping(value = "/student")
    @CrossOrigin
    public ResponseEntity<?> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(),HttpStatus.OK);
    }
    
    @GetMapping(value = "/student/{id}")
    @CrossOrigin
    public Student getStudent(@PathVariable("id")String id){
        return this.studentService.getStudent(id).orElse(null);
    }
    
    @CrossOrigin(origins = "*", methods = RequestMethod.POST, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PostMapping(value = "/student")
    public ResponseEntity<?> save(@RequestBody Student student) {
        studentService.save(student);
        
        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data berhasil disimpan");
        return new ResponseEntity<>(map,HttpStatus.CREATED);

    }
    
    @CrossOrigin(origins = "*", methods = RequestMethod.PUT, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @PutMapping(value = "/student/{id}")
    public ResponseEntity<?> update (@PathVariable("id")String id,@RequestBody Student student) {
        studentService.update(student);
        
        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data berhasil diubah");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

    @CrossOrigin(origins = "*", methods = RequestMethod.DELETE, maxAge = 3600, allowedHeaders = {"accept", "authorization", "x-requested-with", "content-type"})
    @DeleteMapping(value = "/student/{id}")
    public ResponseEntity<?> delete (@PathVariable("id") String id) {
         
        studentService.delete(id);
        
        Map<String, Object> map = new HashMap<>();
        map.put("success", Boolean.TRUE);
        map.put("info", "data berhasil dihapus");
        return new ResponseEntity<>(map,HttpStatus.OK);
    }
    
}

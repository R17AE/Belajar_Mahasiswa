/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.agung.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author user
 */
@Entity
@Table(name="tb_student")
public class Student implements Serializable {
    
    @Id
    @Column(name="id")
    @Getter
    @Setter
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String id;
    
    @Column(name="name", length=50, nullable=false)
    @Getter
    @Setter
    private String name;
    
    @Column (name="birth", length=20, nullable=false)
    @Getter
    @Setter
    private String birth;
    
    @Column (name="address", length=100, nullable=false)
    @Getter
    @Setter
    private String address;
    
    @Column (name="handphone", length=13, nullable=false)
    @Getter
    @Setter
    private String handphone;
    
    @Column(name="gender", length=10, nullable=false)
    @Enumerated (EnumType.STRING)
    @Getter
    @Setter
    private Gender gender;
    
    
}

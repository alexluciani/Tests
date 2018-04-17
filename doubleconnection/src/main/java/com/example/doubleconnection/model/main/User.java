package com.example.doubleconnection.model.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "spring_jpa_user")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
  
    @Column(unique = true, nullable = false)
    private String email;
 
    private String password;
 
}

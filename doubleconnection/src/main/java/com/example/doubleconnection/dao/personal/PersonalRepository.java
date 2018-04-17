package com.example.doubleconnection.dao.personal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.doubleconnection.model.personal.Personal;

public interface PersonalRepository extends JpaRepository<Personal, Integer> { 

}


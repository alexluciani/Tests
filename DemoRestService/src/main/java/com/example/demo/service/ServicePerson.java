package com.example.demo.service;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Service;

@Service
@XmlRootElement
public class ServicePerson {

	private String id;
	private String name;
	private String age;
	private String height;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
}

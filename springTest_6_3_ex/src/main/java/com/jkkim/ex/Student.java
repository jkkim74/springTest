package com.jkkim.ex;

import java.util.List;

public class Student {
	private String name;
	private List<?> hobby;
	private int weight;
	private int height;
	private int age;
	
	public Student(String name,int age, List<?> hobby) {
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}
	
    public int getAge() {
    	return age;
    }
    
	public String getName() {
		return name;
	}

	public List<?> getHobby() {
		return hobby;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

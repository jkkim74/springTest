package com.jkkim.ex;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private ArrayList<?> hobby;
	private int weight;
	private int height;
	
	public Student(String name, ArrayList<?> hobby) {
		this.name = name;
		this.hobby = hobby;
	}

	public String getName() {
		return name;
	}

	public ArrayList<?> getHobby() {
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

package com.jkkim.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="goodStudent")
	public Student student1() {
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("독서");
		hobby.add("바둑");
		
		Student student = new Student("홍길동",25,hobby);
		student.setHeight(168);
		student.setWeight(65);
		
		return student;
	}
	
	@Bean
	public Student student() {
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("축구");
		hobby.add("야구");
		
		Student student = new Student("홍길이",25,hobby);
		student.setHeight(168);
		student.setWeight(65);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("독서");
		hobby.add("음악감사");
		
		Student student = new Student("홍길순",18,hobby);
		student.setHeight(160);
		student.setWeight(55);
		
		return student;
	}

}

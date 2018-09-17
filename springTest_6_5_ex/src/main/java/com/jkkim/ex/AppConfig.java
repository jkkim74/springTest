package com.jkkim.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationCTX.xml")//XML을 갖다쓸때 이부분을 추가함..
public class AppConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobby = new ArrayList<String>();
		hobby.add("수영");
		hobby.add("요리");
		
		Student student = new Student("홍길동",19,hobby);
		student.setHeight(165);
		student.setWeight(75);
		return student;
	}

}

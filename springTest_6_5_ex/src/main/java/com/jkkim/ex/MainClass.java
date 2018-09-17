package com.jkkim.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		//String configLocation = "classpath:applicationCTX.xml";
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getHeight());
		System.out.println(student1.getWeight());
		System.out.println(student1.getHobby());
		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println(student2.getHobby());
	}
}

package com.jkkim.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Student goodStudent = ctx.getBean("goodStudent",Student.class);
		System.out.println(goodStudent.getName());
		System.out.println(goodStudent.getAge());
		System.out.println(goodStudent.getHeight());
		System.out.println(goodStudent.getWeight());
		System.out.println(goodStudent.getHobby());
		
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getHeight());
		System.out.println(student.getWeight());
		System.out.println(student.getHobby());
		
		Student student2 = ctx.getBean("student2",Student.class);
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHeight());
		System.out.println(student2.getWeight());
		System.out.println(student2.getHobby());
		
		ctx.close();

	}

}

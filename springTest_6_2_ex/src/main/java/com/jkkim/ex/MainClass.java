package com.jkkim.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocation1 = "classpath:applicationCTX.xml";
		String configLocation2 = "classpath:applicationCTX1.xml";
		@SuppressWarnings("resource")
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1,configLocation2);
		Student student1 = ctx.getBean("student1",Student.class);
		System.out.println(student1.getName());
		System.out.println(student1.getHobby());
		
		
		StudentInfo studentInfo = ctx.getBean("studentInfo1",StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println(student2.getName());
		System.out.println(student2.getHobby());
		
		if(student1.equals(student2)) {
			System.out.println("stuent1 == student2");
		}
		
		Student student3 = ctx.getBean("student3",Student.class);
		System.out.println(student3.getName());
		
		if(student1.equals(student3)) {
			System.out.println("student1 == student3");
		}else {
			System.out.println("student1 != student3");
		}
		
		Family family = ctx.getBean("family",Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getSisterName());
		System.out.println(family.getBrotherName());
	}

}

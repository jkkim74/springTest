package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student = ctx.getBean("student",Student.class);
		System.out.println(student.toString());
		
		Worker worker = ctx.getBean("worker",Worker.class);
		System.out.println(worker.toString());
	}

}

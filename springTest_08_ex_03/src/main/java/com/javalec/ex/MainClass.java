package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GenericXmlApplicationContext gCtx = new GenericXmlApplicationContext();
		//gCtx.load("applicationCTX.xml");
		//gCtx.refresh();
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminConnection adminConnection = ctx.getBean("adminConfig",AdminConnection.class);
		System.out.println("admin ID : "+adminConnection.getAdminId());
		System.out.println("admin PW : "+adminConnection.getAdminPw());
		System.out.println("sub admin ID : "+adminConnection.getSub_adminId());
		System.out.println("sub admin PW : "+adminConnection.getSub_adminPw());

		ctx.close();
	}

}

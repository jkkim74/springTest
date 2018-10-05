package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String config = null;
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		if(str.equals("dev")) {
			config = "dev";
		}else if(str.equals("run")) {
			config = "run";
		}else {
			config = "dev";
		}
		
		scanner.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
	    ctx.register(ApplicationConfig_dev.class,ApplicationConfig_run.class);
	    ctx.refresh();
		
		ServerInfo info = ctx.getBean("serverInfo",ServerInfo.class);
		System.out.println("ip  : "+info.getIpNum());
		System.out.println("port  : "+info.getPortNum());
		ctx.close();

	}

}

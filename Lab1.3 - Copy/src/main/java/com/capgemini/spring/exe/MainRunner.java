package com.capgemini.spring.exe;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.spring.config.JavaConfig;
import com.capgemini.spring.entities.SBU;

public class MainRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		Class configurationClass = JavaConfig.class;
		context.register(configurationClass);
		context.refresh();
		SBU sbu = context.getBean(SBU.class);
		System.out.println(sbu);
	}
}

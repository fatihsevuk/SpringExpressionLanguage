package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalisanTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		Calisan calisan=context.getBean("calisanId" , Calisan.class);
		System.out.println(calisan);
		((ClassPathXmlApplicationContext)context).close();

	}

}

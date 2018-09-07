package com.javalec.ex;

import java.io.IOException;
import java.util.ArrayList;

import org.hibernate.exception.spi.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;


public class MainClass {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println( env.getProperty("admin.id") );
			System.out.println( env.getProperty("admin.pw") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GenericXmlApplicationContext gctx = (GenericXmlApplicationContext)ctx;
		gctx.load("applicationCTX.xml");
		gctx.refresh();
		AdminConnection adminconnection = gctx.getBean("adminconection",AdminConnection.class);
		System.out.println(adminconnection.getAdminId());
		System.out.println(adminconnection.getAdminPw());
		gctx.close();
		ctx.close();
		
	}
	
}
package com.javalec.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.PostPersist;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;


public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean{
	
	private String id;
	private String pw;
	private Environment env;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		this.id = env.getProperty("admin.id");
		this.pw = env.getProperty("admin.pw");
	}
	@Override
	public void setEnvironment(Environment environment) {
		// TODO Auto-generated method stub
		System.out.println("**환경 설정 부분**");
		setEnv(environment);
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("bean 객체가 종료 되었습니다. ");
	}
	
	
}
package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.AccountDAO;
import model.AcountService;

public class TestIOC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("ioc.xml");
		AcountService service = (AcountService)factory.getBean("accountService");
		
		System.out.println("검색결과 :"+service.findAccountById("1"));
		factory.close();
	}
}
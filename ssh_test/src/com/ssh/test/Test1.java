package com.ssh.test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.dao.EmpDao;
import com.ssh.service.EmpService;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//得到session工厂
		//SessionFactory sf = (SessionFactory) context.getBean("sessionFactory");
	EmpService empdao=(EmpService)context.getBean("empService");
		System.out.println(empdao);
	}

}

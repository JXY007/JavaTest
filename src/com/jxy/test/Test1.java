package com.jxy.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxy.dao.IUserDao;

public class Test1 {
	@Test
	public void demo(){
		String pathString="classpath:applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(pathString);
		IUserDao user=(IUserDao) context.getBean("userDao");
		user.save();
	}
	
}

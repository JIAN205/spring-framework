package com.czj.test;

import com.czj.pojo.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class SpringTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		User user = beanFactory.getBean(User.class);
		System.out.println(user);
	}
}
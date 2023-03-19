package com.assignment.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	     Question ques = context.getBean("q",Question.class);
	     ques.displayInfo();
	     context.close();
	}

}

package com.shop.accounts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.accounts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// init
		System.out.println("----------------------------------------");
		ConfigurableApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("accounts-service.xml");
		System.out.println("----------------------------------------");

		// use
		System.out.println("----------------------------------------");
		TxrService txrService = context.getBean(TxrService.class);
		txrService.txr(100.00, "1", "2");
		System.out.println();
		txrService.txr(100.00, "1", "2");
		System.out.println("----------------------------------------");

		// destroy
		System.out.println("----------------------------------------");
		context.close();
		System.out.println("----------------------------------------");

	}

}

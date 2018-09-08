package com.shop.accounts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.accounts.config.AccountsServiceConfig;
import com.shop.accounts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// init
		System.out.println("----------------------------------------");
		ConfigurableApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(AccountsServiceConfig.class);
		System.out.println("----------------------------------------");

		// use
		System.out.println("----------------------------------------");
		TxrService txrService = context.getBean("txrService",TxrService.class);
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

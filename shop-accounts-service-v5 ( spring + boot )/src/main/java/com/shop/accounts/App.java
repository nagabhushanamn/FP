package com.shop.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shop.accounts.config.MyFeatureProperties;
import com.shop.accounts.service.TxrService;

//@EnableAutoConfiguration
//@Configuration
//@ComponentScan(basePackages = { "com.shop.accounts.service", "com.shop.accounts.repository","com.shop.accounts.config" })
// or
@SpringBootApplication()
@EnableTransactionManagement
public class App {

	public static void main(String[] args) {

		// init
		System.out.println("----------------------------------------");
		ConfigurableApplicationContext context = null;
		context = SpringApplication.run(App.class, args);
		System.out.println("----------------------------------------");

		// use
		System.out.println("----------------------------------------");
		TxrService txrService = context.getBean("txrService", TxrService.class);
		txrService.txr(100.00, "1", "2");
		System.out.println();
		txrService.txr(100.00, "1", "2");

		MyFeatureProperties featureProperties = context.getBean(MyFeatureProperties.class);
		System.out.println(featureProperties.getFeatureEnabled());

		System.out.println("----------------------------------------");

		// destroy
		System.out.println("----------------------------------------");
		//context.close();
		System.out.println("----------------------------------------");

	}
}

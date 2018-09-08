package com.shop.accounts.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.shop.accounts.service","com.shop.accounts.repository","com.shop.accounts.config"})
public class AccountsServiceConfig {

	@Bean
	public DataSource dataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		// ...
		return basicDataSource;
	}

}

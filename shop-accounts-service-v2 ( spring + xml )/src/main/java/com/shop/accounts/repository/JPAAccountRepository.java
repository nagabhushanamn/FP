package com.shop.accounts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.shop.accounts.model.Account;

public class JPAAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("shop-accounts");

	private DataSource dataSource;


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JPAAccountRepository() {
		logger.info("JPAAccountRepository instance created...");
	}

	public Account load(String num) {
		logger.info("loading account -" + num);
		return null;
	}

	public void update(Account account) {
		logger.info("updating account -");
	}

}

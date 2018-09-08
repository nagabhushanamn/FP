package com.shop.accounts.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.shop.accounts.model.Account;

//@Component
@Repository
public class JPAAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger("shop-accounts");

	@PersistenceContext
	private EntityManager em;

	public JPAAccountRepository() {
		logger.info("JPAAccountRepository instance created...");
	}

	public Account load(String num) {
		logger.info("loading account -" + num);
		return em.find(Account.class, num);
	}

	public void update(Account account) {
		logger.info("updating account -" + account.getNum());
		em.merge(account);
	}

}

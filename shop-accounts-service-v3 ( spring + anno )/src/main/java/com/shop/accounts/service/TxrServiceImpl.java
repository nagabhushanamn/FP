package com.shop.accounts.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.accounts.model.Account;
import com.shop.accounts.repository.AccountRepository;

@Component(value="txrService")
public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger("shop-accounts");

	private AccountRepository accountRepository;

	@Autowired
	public TxrServiceImpl(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
		logger.info("TxrServiceImpl instance created by injecting accountRepository");
	}

	public void txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("Txr initiated..");

		Account fromAccount = accountRepository.load(fromAccNum);
		Account toAccount = accountRepository.load(toAccNum);

		//

		accountRepository.update(toAccount);
		accountRepository.update(fromAccount);

		logger.info("Txr Success..");

	}

}

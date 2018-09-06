package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

public class NEFTTxrService implements TxrService {

	private static Logger logger = Logger.getLogger("bank");

	private AccountRepository accountRepository;

	public NEFTTxrService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("NEFTTxrService instance created..");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bank.service.TxrService#txr(double, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("txr initiated..");

		Account fromAccount = accountRepository.loadAccount(fromAccNum);
		Account toAccount = accountRepository.loadAccount(toAccNum);

		//

		accountRepository.updateAccount(fromAccount);
		accountRepository.updateAccount(toAccount);

		logger.info("txr success..");

		return true;

	}

}

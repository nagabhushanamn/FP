package com.bank.service;

import org.apache.log4j.Logger;

import com.bank.model.Account;
import com.bank.repository.JdbcAccountRepository;

/*
 *  design & performance issues
 *  ----------------------------
 *  
 *  => tight coupling b/w dependent & dependency 
 *  
 *  	-> can't extend your module with new-features
 *  
 *  => on each oprn, we are creating new dependency
 *  
 *  	-> slow, memory/resource-use high
 *  
 *  => unit-testing not possible
 *  
 *      -> dev/bug fix slow
 * 
 * 
 *    why these issues are occurring here?
 *    
 *    
 *    => dependent itself creating its own dependency
 *    
 *    soln : don't create in your home , get from factory
 *    
 *    limitation on factory-lookup:
 *    
 *    ==> location tight-coupling
 *    
 *    best soln : dont create/lookup , inject by 'third-party'  ( Inversion of Control ) ==> IOC
 *    
 *    
 *    
 *    
 *    
 * 
 */

public class NEFTTxrService {

	private static Logger logger = Logger.getLogger("bank");
	private JdbcAccountRepository jdbcAccountRepository;

	public NEFTTxrService() {
		logger.info("NEFTTxrService instance created..");
	}

	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		logger.info("txr initiated..");

		jdbcAccountRepository = new JdbcAccountRepository(); // dependency

		Account fromAccount = jdbcAccountRepository.loadAccount(fromAccNum);
		Account toAccount = jdbcAccountRepository.loadAccount(toAccNum);

		//

		jdbcAccountRepository.updateAccount(fromAccount);
		jdbcAccountRepository.updateAccount(toAccount);

		logger.info("txr success..");
		
		return true;

	}

}

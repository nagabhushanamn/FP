package com.bank;

import org.apache.log4j.Logger;

import com.bank.repository.AccountRepository;
import com.bank.repository.JdbcAccountRepository;
import com.bank.repository.JpaAccountRepository;
import com.bank.service.NEFTTxrService;
import com.bank.service.TxrService;

public class App {

	private static Logger logger = Logger.getLogger("bank");

	public static void main(String[] args) {

		// init
		System.out.println("-----------------------------------");
		
		AccountRepository accountRepository = new JdbcAccountRepository();
		accountRepository = new JpaAccountRepository();
		TxrService txrService = new NEFTTxrService(accountRepository);
		
		System.out.println("-----------------------------------");
		// use
		txrService.txr(1000, "1", "2");
		System.out.println();
		txrService.txr(2000, "3", "4");
		
		System.out.println("-----------------------------------");
		// destroy
		// ......
		System.out.println("-----------------------------------");

	}

}

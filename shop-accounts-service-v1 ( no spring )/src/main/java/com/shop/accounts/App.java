package com.shop.accounts;

import com.shop.accounts.repository.AccountRepository;
import com.shop.accounts.repository.JPAAccountRepository;
import com.shop.accounts.service.TxrService;
import com.shop.accounts.service.TxrServiceImpl;

public class App {

	public static void main(String[] args) {

		// init
		System.out.println("----------------------------------------");
		AccountRepository accountRepository = new JPAAccountRepository();
		TxrService txrService = new TxrServiceImpl(accountRepository);
		System.out.println("----------------------------------------");

		// use
		System.out.println("----------------------------------------");
		txrService.txr(100.00, "1", "2");
		System.out.println();
		txrService.txr(100.00, "1", "2");
		System.out.println("----------------------------------------");

		// destroy
		System.out.println("----------------------------------------");
		System.out.println("----------------------------------------");

	}

}

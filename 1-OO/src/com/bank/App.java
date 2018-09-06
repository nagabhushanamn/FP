package com.bank;

import org.apache.log4j.Logger;

import com.bank.service.NEFTTxrService;

public class App {

	private static Logger logger = Logger.getLogger("bank");

	public static void main(String[] args) {

		// init
		System.out.println("-----------------------------------");
		NEFTTxrService txrService = new NEFTTxrService();
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

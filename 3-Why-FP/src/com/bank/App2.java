package com.bank;

import java.util.List;

import com.bank.model.Txn;
import com.bank.service.TxnService;
import com.bank.service.TxnServiceImpl;

public class App2 {

	public static void main(String[] args) {

		TxnService txnService = new TxnServiceImpl();
		List<Txn> list = txnService.getTxns(1000.00);
		display(list);

	}

	private static void display(List<Txn> list) {
		for (Txn txn : list) {
			System.out.println(txn);
		}
	}

}

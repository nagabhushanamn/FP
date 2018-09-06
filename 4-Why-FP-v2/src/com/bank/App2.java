package com.bank;

import java.time.LocalDate;
import java.util.List;

import com.bank.model.Txn;
import com.bank.service.TxnService;
import com.bank.service.TxnServiceImpl;

public class App2 {

	public static void main(String[] args) {

		TxnService txnService = new TxnServiceImpl();
		List<Txn> list = txnService.getTxns(LocalDate.of(2017, 4, 4));
		display(list);

	}

	private static void display(List<Txn> list) {
		for (Txn txn : list) {
			System.out.println(txn);
		}
	}

}

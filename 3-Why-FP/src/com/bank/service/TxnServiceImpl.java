package com.bank.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bank.model.Txn;
import com.bank.model.TxnType;

public class TxnServiceImpl implements TxnService {

	private static List<Txn> txns = new ArrayList<>();

	static {
		txns.add(new Txn(21313, 1000.00, LocalDate.of(2017, 04, 13), TxnType.DEBIT));
		txns.add(new Txn(34234, 2000.00, LocalDate.of(2017, 04, 4), TxnType.DEBIT));
		txns.add(new Txn(44234, 3000.00, LocalDate.of(2018, 02, 13), TxnType.CREDIT));
		txns.add(new Txn(56767, 1000.00, LocalDate.of(2018, 04, 12), TxnType.DEBIT));
		txns.add(new Txn(63423, 3000.00, LocalDate.of(2018, 06, 3), TxnType.CREDIT));
		txns.add(new Txn(75645, 6000.00, LocalDate.of(2018, 07, 6), TxnType.DEBIT));
		txns.add(new Txn(85656, 9000.00, LocalDate.of(2018, 03, 8), TxnType.DEBIT));
	}

	@Override
	public List<Txn> getTxns(int count) {
		// imperative style coding( what + how )
		List<Txn> result = new ArrayList<>();
		int i = 0;
		for (Txn txn : txns) {
			result.add(txn);
			i++;
			if (i == count)
				break;
		}
		return result;
	}

	@Override
	public List<Txn> getTxns(double amount) {
		// imperative style coding( what + how )
		List<Txn> result = new ArrayList<>();
		for (Txn txn : txns) {
			if (txn.getAmount() == amount)
				result.add(txn);
		}
		return result;
	}

	@Override
	public List<Txn> getTxns(LocalDate date) {
		return null;
	}

	@Override
	public List<Txn> getTxns(LocalDate from, LocalDate to) {
		return null;
	}

}

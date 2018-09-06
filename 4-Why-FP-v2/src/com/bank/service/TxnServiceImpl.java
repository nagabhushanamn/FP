package com.bank.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.bank.model.Txn;
import com.bank.model.TxnType;
import com.bank.service.lib.TxnUtilLib;

public class TxnServiceImpl implements TxnService {

	private static List<Txn> txns = new ArrayList<>();

	static {
		txns.add(new Txn(21313, 1000.00, LocalDate.of(2017, 4, 13), TxnType.DEBIT));
		txns.add(new Txn(34234, 2000.00, LocalDate.of(2017, 4, 4), TxnType.DEBIT));
		txns.add(new Txn(44234, 3000.00, LocalDate.of(2018, 2, 13), TxnType.CREDIT));
		txns.add(new Txn(56767, 1000.00, LocalDate.of(2018, 4, 12), TxnType.DEBIT));
		txns.add(new Txn(63423, 3000.00, LocalDate.of(2018, 6, 3), TxnType.CREDIT));
		txns.add(new Txn(75645, 6000.00, LocalDate.of(2018, 7, 6), TxnType.DEBIT));
		txns.add(new Txn(85656, 9000.00, LocalDate.of(2018, 03, 8), TxnType.DEBIT));
	}

	@Override
	public List<Txn> getTxns(int count) {
		return null;
	}

	@Override
	public List<Txn> getTxns(double amount) {
		// declarative style coding
		// way-1: local inner class
		class ByAmountCondition implements Predicate<Txn> {
			@Override
			public boolean test(Txn t) {
				return t.getAmount() == amount;
			}
		}
		return TxnUtilLib.filter(txns, new ByAmountCondition());
	}

	@Override
	public List<Txn> getTxns(LocalDate date) {
		// way-2: by anonymous inner class
		Predicate<Txn> byDateCondition = new Predicate<Txn>() {
			@Override
			public boolean test(Txn t) {
				return t.getDate().equals(date);
			}
		};
		return TxnUtilLib.filter(txns, byDateCondition);
	}

	@Override
	public List<Txn> getTxns(LocalDate from, LocalDate to) {
		return null;
	}

}

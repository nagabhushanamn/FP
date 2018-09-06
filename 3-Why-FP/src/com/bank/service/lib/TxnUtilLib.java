package com.bank.service.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.bank.model.Txn;

public class TxnUtilLib {
	public static List<Txn> filter(List<Txn> txns,Predicate<Txn> predicate) {
		
		// How
		List<Txn> result = new ArrayList<>();
		for (Txn txn : txns) {
			if(predicate.test(txn)) {
				result.add(txn);
			}
		}
		return result;

	}

}

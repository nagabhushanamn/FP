package com.shop.accounts.repository;

import com.shop.accounts.model.Account;

public interface AccountRepository {

	Account load(String num);

	void update(Account account);

}

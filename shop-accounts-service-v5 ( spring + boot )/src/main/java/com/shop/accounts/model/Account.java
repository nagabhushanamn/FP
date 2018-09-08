package com.shop.accounts.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTS")
public class Account {

	@Id
	private String num;
	private double balance;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(String num, double balance) {
		super();
		this.num = num;
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]";
	}

}

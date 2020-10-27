package com.training.example;

public class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}

	public double deposit(double amount) throws ExceedingException {
		if(amount<0) {
			throw new NegValueException("amount less than zero");
		}
		if(amount>11000)
		{
			throw new ExceedingException("amount beyond limit");
		}
		balance=balance+amount;
		return balance;
	}
	public double withdraw(double amount) throws ExceedingException{
		if(amount>5000 || amount==balance) {
			throw new ExceedingException("amount beyond limit");
		}
		if(amount<=0) {
			throw new NegValueException("amount less than or equal to zero");
		}
		balance=balance-amount;
		return balance;
	}

}

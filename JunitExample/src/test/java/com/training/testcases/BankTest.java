package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.example.Bank;
import com.training.example.ExceedingException;
import com.training.example.NegValueException;

class BankTest {
	Bank bank;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Init");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("destroy");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeTest");
		bank=new Bank(8000);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Test");
		bank=null;
	}

	@Test
	void testDeposit() throws ExceedingException {
		double balance=bank.deposit(3000);
		assertEquals(11000,balance);
	}
	@Test
	void testDepositNeg(){
		assertThrows(NegValueException.class,()->bank.deposit(-400));
	}
	@Test
	@DisplayName("Test deposit")
	void testDepositExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(11100));
	}
	@Test
	void testWithdraw() throws ExceedingException {
		double balance=bank.withdraw(3000);
		assertEquals(5000,balance);
	}
	@Test
	void testWithdrawNeg(){
		assertThrows(NegValueException.class,()->bank.withdraw(-400));
	}
	@Test
	void testWithdrawExceeding() {
		assertThrows(ExceedingException.class,()->bank.withdraw(5100));
	}
	@Test
	void testWithdrawEqual() {
		assertThrows(ExceedingException.class,()->bank.withdraw(8000));
	}

}

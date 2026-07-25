package com.bank.account.management;
 public class BankAccount {
	
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount(int accountNumber,String accountHolderName,double balance)
	{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	//getters
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	
	//setters
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	//business logic method
	public void deposit(double depositAmount)
	
	{
		if(depositAmount>0){
		System.out.println("deposit of amount "+depositAmount+" is sucessfull");
		 balance=balance+depositAmount;
		 System.out.println("current balance:"+balance);
		}
	}
	public void withdraw(double withdrawAmount)
	{
		
		if((withdrawAmount<=balance)&&(withdrawAmount>0))
		 {
		 System.out.println("withdraw of amount "+withdrawAmount+" is sucessfull");
		 balance=balance-withdrawAmount;
		 System.out.println("current balance:"+balance);
		 }
		else
		{
		 System.out.println("Insufficient balance");
		}
	}
	
	

}

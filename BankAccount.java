package com.bank.account.management;
 public class BankAccount {

	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;
	
	public BankAccount(String customerName ,String customerAddress , long phoneNumber ,double balance)
	{
		
		this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
	}
	
	//getters
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	
	public String getCustomerAddress()
	{
		return customerAddress;
	}
	
	public long getPhoneNumber()
	{
		return phoneNumber;
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
		 System.out.println(" ");
		}
	}
	public void withdraw(double withdrawAmount)
	{
		
		if((withdrawAmount<=balance)&&(withdrawAmount>0))
		 {
		 System.out.println("withdraw of amount "+withdrawAmount+" is sucessfull");
		 balance=balance-withdrawAmount;
		 System.out.println("current balance:"+balance);
		 System.out.println(" ");
		 }
		else
		{
		 System.out.println("Insufficient balance");
		}
	}
	
	

}

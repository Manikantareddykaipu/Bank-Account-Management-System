package com.bank.app;
import com.bank.account.management.*;
import java.util.Scanner;

public class BankProcessor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("accountHolderNumber:");
		int accountHolderNumber=sc.nextInt();
		System.out.print("accountHolderName:");
		String accountHolderName=sc.next();
		System.out.print("balance:");
	    double balance=sc.nextDouble();
	    
	    
	    
		BankAccount bankAccount=new BankAccount(accountHolderNumber,accountHolderName,balance);
		System.out.println("current balance:"+bankAccount.getBalance());
		System.out.println(" ");
		
		System.out.print("enter the amount to deposit:");
		double depositAmount=sc.nextDouble();
		bankAccount.deposit(depositAmount);
		System.out.println(" ");
		
		System.out.print("enter the amount to withdraw:");
		double withdrawAmount=sc.nextDouble();
		bankAccount.withdraw(withdrawAmount);
		
sc.close();
	}

}

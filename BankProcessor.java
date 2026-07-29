package com.bank.app;
import com.bank.account.management.*;
import java.util.Scanner;

public class BankProcessor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("customerName: ");
		String customerName=sc.nextLine();
		
		System.out.print("customerAddress: ");
		String customerAddress=sc.next();
		
		System.out.print("phoneNumber: ");
		long phoneNumber=sc.nextLong();
		
		System.out.print("balance: ");
	    double balance=sc.nextDouble();
	    
	    System.out.println(" ");
	    System.out.println("Account Created Successfully");
	    
	    
		BankAccount bankAccount=new BankAccount(customerName,customerAddress,phoneNumber,balance);
		
		
		System.out.println(" ");
		int choice;
		do
		{
			
			System.out.println("**** Select an Option from Below ****");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
			System.out.print("Enter your option [1-4]: ");
			choice=sc.nextInt();
			System.out.println(" ");
			
		switch(choice)
		{
		case 1:
		     System.out.print("enter the amount to withdraw:");
		     double withdrawAmount=sc.nextDouble();
		     bankAccount.withdraw(withdrawAmount);
		     break;
		
		case 2:
		     System.out.print("enter the amount to deposit:");
		     double depositAmount=sc.nextDouble();
		     bankAccount.deposit(depositAmount);
		     System.out.println(" ");
		     break;
		
		case 3:
			System.out.println("current balance:"+bankAccount.getBalance());
			System.out.println(" ");
			break;
			
		case 4:
			System.out.println("thank you");
			System.out.println(" ");
			break;
		default :
			System.out.println(" invalid option");
			System.out.println(" ");
		}
		
		}while(choice!=4);
		
		
		
         sc.close();
	}

}

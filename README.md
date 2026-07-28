# 🏦 Bank Account Management System

## Overview

The **Bank Account Management System** is a simple Java console application that demonstrates basic banking operations using Object-Oriented Programming (OOP). The application allows a user to create a bank account by entering account details, deposit money, withdraw money, and view the updated account balance.

## Features

* Create a bank account with:

  * Account Number
  * Account Holder Name
  * Initial Balance
* Deposit an amount into the account
* Withdraw an amount from the account
* Display the current balance after each transaction
* Display an "Insufficient balance" message when the withdrawal amount exceeds the available balance

## Technologies Used

* Java
* Eclipse IDE
* Scanner Class
* Object-Oriented Programming (OOP)

## Project Structure

```text
src
├── com.bank.account.management
│   └── BankAccount.java
└── com.bank.app
    └── BankProcessor.java
```

## Concepts Practiced

* Classes and Objects
* Constructors
* Encapsulation
* Getters and Setters
* Methods
* User Input using Scanner
* Conditional Statements
* Packages

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/Manikantareddykaipu/bank-account-management-system.git
```

2. Open the project in Eclipse or any Java IDE.

3. Run the `BankProcessor.java` file.

4. Enter:

   * Account Number
   * Account Holder Name
   * Initial Balance
   * Deposit Amount
   * Withdrawal Amount

5. The application will display the updated balance after each transaction.

## Sample Output

```text
accountHolderNumber:101
accountHolderName:Manikanta
balance:1000

current balance:1000.0

enter the amount to deposit:500
deposit of amount 500.0 is sucessfull
current balance:1500.0

enter the amount to withdraw:300
withdraw of amount 300.0 is sucessfull
current balance:1200.0
```

## Author

**Manikanta Reddy**

GitHub: https://github.com/Manikantareddykaipu

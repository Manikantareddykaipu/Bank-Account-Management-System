# 🏦 Bank Account Management System

## Overview

The **Bank Account Management System** is a simple Java console application that demonstrates basic banking operations using **Object-Oriented Programming (OOP)** principles. The application allows users to create a bank account by entering customer details, deposit money, withdraw money, and check the current account balance through a menu-driven interface.

---

## Features

- Create a bank account with:
  - Customer Name
  - Customer Address
  - Phone Number
  - Initial Balance
- Deposit money into the account
- Withdraw money from the account
- View the current account balance
- Menu-driven console application
- Displays **"Insufficient balance"** when withdrawal amount exceeds available balance

---

## Technologies Used

- Java
- Eclipse IDE
- Scanner Class
- Object-Oriented Programming (OOP)

---

## Project Structure

```
src
├── com.bank.account.management
│   └── BankAccount.java
└── com.bank.app
    └── BankProcessor.java
```

---

## Concepts Practiced

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- Business Logic Methods
- User Input using Scanner
- Switch Statement
- Do-While Loop
- Conditional Statements
- Packages

---

## How to Run

1. Clone the repository.

```bash
git clone https://github.com/Manikantareddykaipu/bank-account-management-system.git
```

2. Open the project in Eclipse or any Java IDE.

3. Run the `BankProcessor.java` file.

4. Enter:
   - Customer Name
   - Customer Address
   - Phone Number
   - Initial Balance

5. Select an option from the menu:
   - Withdraw
   - Deposit
   - Show Balance
   - Exit

---

## Sample Output

```
customerName: Manikanta
customerAddress: Ongole
phoneNumber: 9876543210
balance: 5000

Account Created Successfully

**** Select an Option from Below ****

1. Withdraw
2. Deposit
3. Show Balance
4. Exit

Enter your option [1-4]: 2

enter the amount to deposit:1000
deposit of amount 1000.0 is successful
current balance:6000.0

Enter your option [1-4]: 1

enter the amount to withdraw:2000
withdraw of amount 2000.0 is successful
current balance:4000.0

Enter your option [1-4]: 3

current balance:4000.0

Enter your option [1-4]: 4

thank you
```

---

## Author

**Manikanta Reddy**

GitHub: https://github.com/Manikantareddykaipu

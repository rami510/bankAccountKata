# Bank Account Kata

This project implements a simple bank account system based on the requirements and user stories provided. It is developed with a focus on clean code, simplicity, and test-driven development (TDD).

## Requirements

The system allows:
- **Deposit**: Adding money to the account.
- **Withdrawal**: Removing money from the account (with sufficient balance).
- **Account statement**: Printing a detailed history of transactions, including:
  - Date of transaction
  - Transaction amount (positive for deposits, negative for withdrawals)
  - Updated account balance

## User Stories

### US 1:
**As a bank client, I want to make a deposit in my account so that I can save money.**

### US 2:
**As a bank client, I want to make a withdrawal from my account so that I can retrieve some or all of my savings.**

### US 3:
**As a bank client, I want to see an account statement so that I can check all my transactions and balance.**

## Technologies Used

- **Java 17**: Modern features and improved performance.
- **JUnit 4**: Unit testing framework.
- **Maven**: Build automation tool.

- ## How to Run the Application

1. Clone the repository:

   git clone https://github.com/rami510/bankAccountKata
   cd bank-account-kata

2. Build the project:

   mvn clean install

3. Run the tests:

   mvn test

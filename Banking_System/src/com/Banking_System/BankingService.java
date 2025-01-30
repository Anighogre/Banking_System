package com.Banking_System;

//Imports the List class from the java.util package.
import java.util.List; //The List interface allows handling collections of objects, such as Customer, Account, or Transaction objects.

public interface BankingService {
    void addCustomer(Customer customer); //Declares a method named addCustomer that takes a Customer object as a parameter.
    void addAccount(Account account);
    void addTransaction(Transaction transaction);
    void addBeneficiary(Beneficiary beneficiary);
    Customer findCustomerById(int id); //Declares a method named findCustomerById that takes an integer id as a parameter and returns a Customer object.
    Account findAccountById(int id);
    //Declares a method named getTransactionsByAccountId that takes an integer accountId as a parameter.
    List<Transaction> getTransactionsByAccountId(int accountId); //The method returns a List of Transaction objects associated with the given accountId.
    List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
    //Declares a method named getAllCustomers that does not take any parameters.
    List<Customer> getAllCustomers(); //The method returns a List of all Customer objects in the system.
    List<Account> getAllAccounts();
}


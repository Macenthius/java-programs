/* 
* Loan Eligibilty Checker
* You are working in a bank. Write a program to check the loan eligibility of customers. You have a list of customers incomes, and the bank's
* rule is that only customers earning more than RS. 25,000 per month are eligible. Print the eligible customers' IDs (or names).
*/

import java.util.ArrayList;
import java.util.List;

class Customer{
    String id;
    String name;
    int income;

    Customer(String id, String name, int income){
        this.id = id;
        this.name = name;
        this.income = income;
    }
}

public class LoanBankCheck{
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "Divij", 27000));
        customers.add(new Customer("C002", "Tanmay", 25000));
        customers.add(new Customer("C003", "Kyoshin", 30000));
        customers.add(new Customer("C004", "Elizabeth", 22000));

        int minimumIncome = 25000;

        List<Customer> eligibleCustomers = new ArrayList<>();
        for(Customer customer : customers){
            if(customer.income > minimumIncome){
                eligibleCustomers.add(customer);
            }
        }

        System.out.println("Eligible Customers: ");
        for(Customer customer : eligibleCustomers){
            System.out.println("ID := " + customer.id + ", Name := " + customer.name + ", Income := " + customer.income);
        }
    }
}
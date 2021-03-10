package edu.bu.met.cs665;

import edu.bu.met.cs665.customerfactory.CustomerFactory;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.email.Email;

/**
 * Name: Lakshmi Swethadri Date: 03/09/2021 Course: CS-665 Assignment 3
 * Description: Main class to instantiate email and customerFactory objects.
 */
public class Main {
    /**
     * A main method to run examples. Main class will use CustomerFactory to get a
     * Customer object.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        CustomerFactory customerFactory = new CustomerFactory();

        System.out.println("*********Business Customer***********");
        // Generate an email for a Business customer
        Customer customer1 = customerFactory.getCustomer("BusinessCustomer");
        Email email1 = customer1.createEmailTemplate();
        System.out.println(email1);

        System.out.println("\n");

        System.out.println("*********Frequent Customer***********");
        // Generate an email for a Frequent customer
        Customer customer2 = customerFactory.getCustomer("FrequentCustomer");
        Email email2 = customer2.createEmailTemplate();
        System.out.println(email2);

        System.out.println("\n");

        System.out.println("*********New Customer***********");
        // Generate an email for a New customer
        Customer customer3 = customerFactory.getCustomer("NewCustomer");
        Email email3 = customer3.createEmailTemplate();
        System.out.println(email3);

        System.out.println("\n");

        System.out.println("*********Returning Customer***********");
        // Generate an email for a New customer
        Customer customer4 = customerFactory.getCustomer("ReturningCustomer");
        Email email4 = customer4.createEmailTemplate();
        System.out.println(email4);

        System.out.println("\n");

        System.out.println("*********Vip Customer***********");
        // Generate an email for a New customer
        Customer customer5 = customerFactory.getCustomer("VipCustomer");
        Email email5 = customer5.createEmailTemplate();
        System.out.println(email5);

    }
}

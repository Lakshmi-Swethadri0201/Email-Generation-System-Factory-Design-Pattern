package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Name: Lakshmi Swethadri Date: 03/09/2021 Course: CS-665 Assignment 3
 * Description: Customer interface
 *
 */
public interface Customer {
	/**
	 * Creates the email object for this customer type.
	 * 
	 * @return the email object for this customer type
	 */
	Email createEmailTemplate();

}

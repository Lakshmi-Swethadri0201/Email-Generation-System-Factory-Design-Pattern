package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Creating NewCustomer concrete class implementing the customer interface.
 */
public class NewCustomer implements Customer {
	public static final String SUBJECT = "Welcome !!";
	public static final String HEADERGREETING = "Dear New Customer,";
	public static final String BODY = "We warmly welcome you for joining us.";
	public static final String FOOTERGREETING = "Thank You, Hope you enjoy our service.";

	@Override
	/**
	 * Create Email template for NewCustomer Type
	 * 
	 * @return SUBJECT, HEADERGREETING, BODY,FOOTERGREETING
	 */
	public Email createEmailTemplate() {
		return new Email(SUBJECT, HEADERGREETING, BODY, FOOTERGREETING);
	}

}

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Creating ReturningCustomer concrete class implementing the customer
 * interface.
 */
public class ReturningCustomer implements Customer {

	public static final String SUBJECT = "Sub:Returning Customer Offers";
	public static final String HEADERGREETING = "Dear Returning Customer,";
	public static final String BODY = "We are happy to get you back!";
	public static final String FOOTERGREETING = "Thank You for trusting us again.";

	@Override
	/**
	 * Create Email template for ReturningCustomer Type
	 * 
	 * @return SUBJECT, HEADERGREETING, BODY,FOOTERGREETING
	 */
	public Email createEmailTemplate() {
		return new Email(SUBJECT, HEADERGREETING, BODY, FOOTERGREETING);
	}

}

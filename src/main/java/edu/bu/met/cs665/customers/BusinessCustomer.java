package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Creating BusinessCustomer concrete class implementing the customer interface.
 */
public class BusinessCustomer implements Customer {
	public static final String SUBJECT = "Sub:Business Customer Offers";
	public static final String HEADERGREETING = "Dear Business Customer,";
	public static final String BODY = "New venture details are as below:";
	public static final String FOOTERGREETING = "Thank You for your business with us.";

	@Override
	/**
	 * Create Email template for BusinessCustomer Type
	 * 
	 * @return SUBJECT, HEADERGREETING, BODY,FOOTERGREETING
	 */
	public Email createEmailTemplate() {
		return new Email(SUBJECT, HEADERGREETING, BODY, FOOTERGREETING);
	}

}

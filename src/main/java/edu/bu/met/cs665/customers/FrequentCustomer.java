package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Creating FrequentCustomer concrete class implementing the customer interface.
 */

public class FrequentCustomer implements Customer {
	// Creating concrete class FrequentCustomer implementing customer interface.
	public static final String SUBJECT = "Sub:Frequent Customer Offers";
	public static final String HEADERGREETING = "Dear Frequent Customer,";
	public static final String BODY = "Extra 10 reward points are added to your account for new Year:";
	public static final String FOOTERGREETING = "Thank You for being our frequent customer.";

	@Override
	/**
	 * Create Email template for FrequentCustomer Type
	 * 
	 * @return SUBJECT, HEADERGREETING, BODY,FOOTERGREETING
	 */
	public Email createEmailTemplate() {
		return new Email(SUBJECT, HEADERGREETING, BODY, FOOTERGREETING);
	}

}

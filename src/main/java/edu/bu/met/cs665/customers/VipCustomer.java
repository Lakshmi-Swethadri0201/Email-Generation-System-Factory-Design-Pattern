package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.email.Email;

/**
 * Creating VipCustomer concrete class implementing the customer interface.
 */
public class VipCustomer implements Customer {
	public static final String SUBJECT = "Sub:VIP Customer Offers";
	public static final String HEADERGREETING = "Dear VIP Customer,";
	public static final String BODY = "Holiday package to Florida is been offered for you this year.";
	public static final String FOOTERGREETING = "Thank You for being our VIP customer.";

	@Override
	/**
	 * Create Email template for VipCustomer Type
	 * 
	 * @return SUBJECT, HEADERGREETING, BODY,FOOTERGREETING
	 */
	public Email createEmailTemplate() {
		return new Email(SUBJECT, HEADERGREETING, BODY, FOOTERGREETING);
	}
}

package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import edu.bu.met.cs665.customerfactory.CustomerFactory;
import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;
import edu.bu.met.cs665.email.Email;

public class TestEmail {

	@Test
	public void testBusinessCustomer() {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer1 = customerFactory.getCustomer("BusinessCustomer");
		Email email1 = customer1.createEmailTemplate();
		assertEquals(email1.getSubject(), BusinessCustomer.SUBJECT);
		assertEquals(email1.getHeaderGreeting(), BusinessCustomer.HEADERGREETING);
		assertEquals(email1.getBody(), BusinessCustomer.BODY);
		assertEquals(email1.getFooterGreeting(), BusinessCustomer.FOOTERGREETING);
	}

	@Test
	public void testFrequentCustomer() {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer2 = customerFactory.getCustomer("FrequentCustomer");
		Email email2 = customer2.createEmailTemplate();
		assertEquals(email2.getSubject(), FrequentCustomer.SUBJECT);
		assertEquals(email2.getHeaderGreeting(), FrequentCustomer.HEADERGREETING);
		assertEquals(email2.getBody(), FrequentCustomer.BODY);
		assertEquals(email2.getFooterGreeting(), FrequentCustomer.FOOTERGREETING);
	}

	@Test
	public void testNewCustomer() {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer3 = customerFactory.getCustomer("NewCustomer");
		Email email3 = customer3.createEmailTemplate();
		assertEquals(email3.getSubject(), NewCustomer.SUBJECT);
		assertEquals(email3.getHeaderGreeting(), NewCustomer.HEADERGREETING);
		assertEquals(email3.getBody(), NewCustomer.BODY);
		assertEquals(email3.getFooterGreeting(), NewCustomer.FOOTERGREETING);
	}

	@Test
	public void testVipCustomer() {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer4 = customerFactory.getCustomer("VipCustomer");
		Email email4 = customer4.createEmailTemplate();
		assertEquals(email4.getSubject(), VipCustomer.SUBJECT);
		assertEquals(email4.getHeaderGreeting(), VipCustomer.HEADERGREETING);
		assertEquals(email4.getBody(), VipCustomer.BODY);
		assertEquals(email4.getFooterGreeting(), VipCustomer.FOOTERGREETING);
	}

	@Test
	public void testReturningCustomer() {
		CustomerFactory customerFactory = new CustomerFactory();
		Customer customer5 = customerFactory.getCustomer("ReturningCustomer");
		Email email5 = customer5.createEmailTemplate();
		assertEquals(email5.getSubject(), ReturningCustomer.SUBJECT);
		assertEquals(email5.getHeaderGreeting(), ReturningCustomer.HEADERGREETING);
		assertEquals(email5.getBody(), ReturningCustomer.BODY);
		assertEquals(email5.getFooterGreeting(), ReturningCustomer.FOOTERGREETING);
	}
	
	@Test
	public void testBusinessCustomerNegative() {
			assertNotEquals("Sub:VIP Customer", BusinessCustomer.SUBJECT);	
	}
	
	@Test
	public void testNewCustomerNegative() {
			assertNotEquals("Sub:Hi.....", NewCustomer.SUBJECT);	
	}

}

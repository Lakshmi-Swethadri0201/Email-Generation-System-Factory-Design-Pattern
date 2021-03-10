package edu.bu.met.cs665.customerfactory;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

/**
 * Represents a customer factory. Returns the unique instance of the
 * customerType
 * 
 * @param customerType type of customer
 * @return object for customer type *
 * 
 *         Follows the factory design pattern to create object without exposing
 *         the creation logic to the client and refer to newly created object
 *         using a common interface.
 * 
 */
public class CustomerFactory {
	// creating a Factory to generate object of concrete class based on given
	// information.
	public Customer getCustomer(String customerType) {
		if (customerType == null) {
			return null;
		}
		if (customerType.equalsIgnoreCase("BusinessCustomer")) {
			return new BusinessCustomer();

		} else if (customerType.equalsIgnoreCase("ReturningCustomer")) {
			return new ReturningCustomer();

		} else if (customerType.equalsIgnoreCase("FrequentCustomer")) {
			return new FrequentCustomer();

		} else if (customerType.equalsIgnoreCase("NewCustomer")) {
			return new NewCustomer();

		} else if (customerType.equalsIgnoreCase("VipCustomer")) {
			return new VipCustomer();

		}

		return null;
	}

}

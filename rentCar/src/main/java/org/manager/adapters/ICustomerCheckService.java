package org.manager.adapters;

import org.manager.entities.Customer;

public interface ICustomerCheckService {
    boolean checkIfRealPerson(Customer customer);

}

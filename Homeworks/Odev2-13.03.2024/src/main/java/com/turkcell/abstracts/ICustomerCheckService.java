package com.turkcell.abstracts;

import com.turkcell.entities.Customer;

public interface ICustomerCheckService {
     void checkIfRealPerson(Customer customer);
}

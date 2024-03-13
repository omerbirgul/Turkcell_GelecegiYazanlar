package com.turkcell.abstracts;

import com.turkcell.entities.Customer;

public interface ICustomerCheckService {
     boolean checkIfRealPerson(Customer customer);
}

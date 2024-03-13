package com.turkcell.concrete;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}

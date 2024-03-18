package org.manager.adapters;

import org.manager.entities.Customer;

public class MernisCheckService implements ICustomerCheckService{
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        //this is a mock mernis service
        return true;
    }
}

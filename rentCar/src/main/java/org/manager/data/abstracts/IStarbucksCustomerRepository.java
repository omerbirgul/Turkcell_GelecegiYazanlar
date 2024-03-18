package org.manager.data.abstracts;

import org.manager.entities.Customer;

public interface IStarbucksCustomerRepository extends ICustomerRepository{
    void addStarToCustomer(Customer customer, int starCount);
}

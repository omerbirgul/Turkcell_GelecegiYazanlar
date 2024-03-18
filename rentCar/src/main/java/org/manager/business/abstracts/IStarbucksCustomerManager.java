package org.manager.business.abstracts;

import org.manager.entities.Customer;

public interface IStarbucksCustomerManager extends ICustomerManager {
    void addStarToCustomer(Customer customer, int starCount);
}

package org.manager.business.abstracts;

import org.manager.entities.Coffee;
import org.manager.entities.Customer;

import java.util.List;

public interface ICustomerManager {
    void add(Customer customer);
    List<Customer> getAll();
    void delete(Customer customer);

    void buyCoffee(Customer customer, Coffee coffee);
}

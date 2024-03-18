package org.manager.data.abstracts;

import org.manager.entities.Coffee;
import org.manager.entities.Customer;

import java.util.List;

public interface ICustomerRepository {
    void add(Customer customer);
    List<Customer> getAll();

    void delete(Customer customer);

    void buyCoffe(Customer customer, Coffee coffee);
}

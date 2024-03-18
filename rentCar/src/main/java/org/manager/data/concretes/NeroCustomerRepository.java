package org.manager.data.concretes;

import org.manager.data.abstracts.ICustomerRepository;
import org.manager.entities.Coffee;
import org.manager.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class NeroCustomerRepository implements ICustomerRepository {
    List<Customer> customers = new ArrayList<Customer>();
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);
    }

    @Override
    public void buyCoffe(Customer customer, Coffee coffee) {
        System.out.println(customer.getFullName() + " bought an " + coffee.getName() + " from Nero" );
    }
}

package org.manager.data.concretes;

import org.manager.data.abstracts.IStarbucksCustomerRepository;
import org.manager.entities.Coffee;
import org.manager.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class StarbucksCustomerRepository implements IStarbucksCustomerRepository {
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
        //mock buyCoffe service
        System.out.println(customer.getFullName() + " bought an " + coffee.getName() + " from Starbucks" );
        //add star to customer every order
        this.addStarToCustomer(customer,10);

    }

    @Override
    public void addStarToCustomer(Customer customer, int starCount) {
        int stars = (int) customer.getProperty("stars");
        customer.setProperty("star",stars + starCount);
        System.out.println(customer.getFullName() + " starCount +" +starCount  );
    }
}

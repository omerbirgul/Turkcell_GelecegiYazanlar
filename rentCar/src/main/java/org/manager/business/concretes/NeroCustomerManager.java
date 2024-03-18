package org.manager.business.concretes;

import org.manager.business.abstracts.ICustomerManager;
import org.manager.data.abstracts.ICustomerRepository;
import org.manager.entities.Coffee;
import org.manager.entities.Customer;

import java.util.List;

public class NeroCustomerManager implements ICustomerManager {

    ICustomerRepository _customerRepository;
    public NeroCustomerManager(ICustomerRepository customerRepository){
        _customerRepository = customerRepository;
    }
    @Override
    public void add(Customer customer) {
        _customerRepository.add(customer);
    }

    @Override
    public List<Customer> getAll() {

        return _customerRepository.getAll();
    }

    @Override
    public void delete(Customer customer) {
        _customerRepository.delete(customer);
    }

    @Override
    public void buyCoffee(Customer customer, Coffee coffee) {
        //mock coffee buy service
        _customerRepository.buyCoffe(customer,coffee);
    }
}

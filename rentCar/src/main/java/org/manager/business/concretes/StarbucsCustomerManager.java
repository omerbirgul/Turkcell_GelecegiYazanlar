package org.manager.business.concretes;

import org.manager.business.abstracts.ICustomerManager;
import org.manager.business.abstracts.IStarbucksCustomerManager;
import org.manager.data.abstracts.ICustomerRepository;
import org.manager.data.abstracts.IStarbucksCustomerRepository;
import org.manager.entities.Coffee;
import org.manager.entities.Customer;
import org.manager.adapters.ICustomerCheckService;

import java.util.List;

public class StarbucsCustomerManager implements IStarbucksCustomerManager {

    private IStarbucksCustomerRepository _customerRepository;
    private ICustomerCheckService _mernisService;
    public StarbucsCustomerManager(IStarbucksCustomerRepository customerRepository, ICustomerCheckService mernisService){
        _customerRepository = customerRepository;
        _mernisService = mernisService;
    };
    @Override
    public void add(Customer customer) {
        //if its not real person then throw an err.
        if(!_mernisService.checkIfRealPerson(customer)){
            System.out.println(customer.getFullName() + " is not valid customer. Can't buy coffee");
            return;
        }
        System.out.println(customer.getFullName() + " is valid customer.");
        // mark customer as valid
        customer.setProperty("isValid",true);

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
        boolean isValidCustomer = (boolean) customer.getProperty("isValid");
        if(!isValidCustomer){
            return;
        }
        this._customerRepository.buyCoffe(customer, coffee);
    }

    public void addStarToCustomer(Customer customer, int starCount){
        _customerRepository.addStarToCustomer(customer,starCount);
    }
}

package com.turkcell.concrete;

import com.turkcell.abstracts.BaseCustomerManager;
import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.abstracts.ICustomerService;
import com.turkcell.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager
{

    private ICustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        _customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) {

        super.save(customer);
    }




}

package com.turkcell;

import com.turkcell.abstracts.BaseCustomerManager;
import com.turkcell.concrete.NeroCustomerManager;
import com.turkcell.entities.Customer;

import java.time.LocalDateTime;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        BaseCustomerManager customerManager = new NeroCustomerManager();
        customerManager.save(new Customer(1,"Omer","Birgul", new Date(), "10"));
    }
}
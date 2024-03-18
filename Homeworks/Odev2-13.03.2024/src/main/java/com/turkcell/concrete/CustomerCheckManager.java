package com.turkcell.concrete;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.entities.Customer;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.Provider;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
    
}

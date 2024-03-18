package org.manager;

import org.manager.adapters.ICustomerCheckService;
import org.manager.adapters.MernisCheckService;
import org.manager.business.abstracts.ICustomerManager;
import org.manager.business.abstracts.IStarbucksCustomerManager;
import org.manager.business.concretes.NeroCustomerManager;
import org.manager.business.concretes.StarbucsCustomerManager;
import org.manager.data.abstracts.ICustomerRepository;
import org.manager.data.abstracts.IStarbucksCustomerRepository;
import org.manager.data.concretes.NeroCustomerRepository;
import org.manager.data.concretes.StarbucksCustomerRepository;
import org.manager.entities.Coffee;
import org.manager.entities.Customer;

public class Main {
    public static void main(String[] args) {
        try{

            Customer john = new Customer("22232232232","John","Doe");
            Customer mary = new Customer("22222222212","Mary","Jane",0);
            Coffee coffee = new Coffee("Americano",5.99);

            //service and repo imports
            IStarbucksCustomerRepository starbucksCustomerRepository = new StarbucksCustomerRepository();
            ICustomerCheckService mernisCheckService = new MernisCheckService();
            ICustomerRepository neroCustomerRepository = new NeroCustomerRepository();

            //base services
            IStarbucksCustomerManager starbucksCustomerManager = new StarbucsCustomerManager(starbucksCustomerRepository,mernisCheckService);
            ICustomerManager neroCustomerManager = new NeroCustomerManager(neroCustomerRepository);

            starbucksCustomerManager.add(mary);
            neroCustomerManager.add(john);

            starbucksCustomerManager.buyCoffee(mary,coffee);
            neroCustomerManager.buyCoffee(john,coffee);


        }catch (Error e){
            System.out.println(e.getMessage());
        }



    }
}
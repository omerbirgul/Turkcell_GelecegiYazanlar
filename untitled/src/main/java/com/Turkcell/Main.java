package com.Turkcell;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
//        CustomerManager customerManager = new CustomerManager(new FileLogger());
//        CustomerManager customerManager = new CustomerManager(new EmailLogger());


        customerManager.add();
    }
}
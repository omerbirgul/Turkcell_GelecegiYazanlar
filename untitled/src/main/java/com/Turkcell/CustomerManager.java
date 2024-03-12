package com.Turkcell;

public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add()
    {
        System.out.println("musteri eklendi");
        this.baseLogger.log("log mesaji");
    }
}

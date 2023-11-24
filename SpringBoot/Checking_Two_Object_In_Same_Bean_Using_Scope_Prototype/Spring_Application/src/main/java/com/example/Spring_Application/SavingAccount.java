package com.example.Spring_Application;

public class SavingAccount implements Account{

    public String display(){
        return "This is A saving Account";
    }

    public SavingAccount(){

        System.out.println("Saving Account Lazy");
    }
}

package com.example.Spring_Application.rest;

import com.example.Spring_Application.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestControllerApplication {

    private Account account;         // object created

    @Autowired

    public MyRestControllerApplication( @Qualifier("currentAccount") Account account){
        this.account=account;
    }

    @GetMapping("/")
    public String displayDetails(){

        return account.display();
    }


}

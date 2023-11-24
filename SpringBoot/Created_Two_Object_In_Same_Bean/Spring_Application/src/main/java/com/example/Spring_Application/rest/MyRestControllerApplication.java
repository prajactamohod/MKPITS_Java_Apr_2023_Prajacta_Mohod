package com.example.Spring_Application.rest;

import com.example.Spring_Application.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestControllerApplication {

    private Account account1;         // object created
    private Account account2;

    @Autowired

    public MyRestControllerApplication( @Qualifier("currentAccount") Account account1,@Qualifier("currentAccount")Account account2){
        this.account1=account1;
        this.account2=account2;

    }

    @GetMapping("/")
    public String displayDetails(){

        return account1.display();
    }
    @GetMapping("/check")
    public String checkBeans()
    {
        return "returns"+(account1==account2);
    }


}

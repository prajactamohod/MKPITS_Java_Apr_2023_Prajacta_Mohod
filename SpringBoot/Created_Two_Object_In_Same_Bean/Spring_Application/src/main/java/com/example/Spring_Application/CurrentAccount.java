package com.example.Spring_Application;

import org.springframework.stereotype.Component;

@Component
public class CurrentAccount  implements Account{
    public String display(){

        return "Hello To Prajacta_Mohod";

    }
}

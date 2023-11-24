package com.example.Spring_Application;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CurrentAccount  implements Account{
    public String display(){

        return "Hello To Prajacta_Mohod";

    }
    @PostConstruct
    public void Startupwork(){
        System.out.println("Start Up Work" +getClass().getSimpleName());   //methods to see the bean name
    }

    @PreDestroy
    public void Stopwork(){

        System.out.println("End Of The Work" +getClass().getSimpleName());
    }
}


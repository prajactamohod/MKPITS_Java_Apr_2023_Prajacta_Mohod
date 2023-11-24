package com.example.Spring_Application;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CurrentAccount  implements Account{
    public String display(){

        return "Hello To Prajacta_Mohod";

    }
}

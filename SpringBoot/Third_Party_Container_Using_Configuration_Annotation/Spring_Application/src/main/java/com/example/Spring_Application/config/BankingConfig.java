package com.example.Spring_Application.config;

import com.example.Spring_Application.Account;
import com.example.Spring_Application.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankingConfig {
    @Bean
    // bean id
    public Account loanAccount(){
        return new LoanAccount();
    }
}

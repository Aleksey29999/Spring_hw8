package com.example.empl4sem2CRUD.config;

import com.example.empl4sem2CRUD.aspect.RegistrationActions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy  // включаем работу с аспектами
public class Config {

    @Bean // подключаем логику
    public RegistrationActions registrationActions() {return new RegistrationActions();}
}

package com.example.demo2.DTO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Esta indica cual crea los beans
public class Config {

    @Bean
    public Person metodo(@Qualifier("policeMan") JobInterface job, @Qualifier("pabloName") String personName){
        Person persona= new Person(job, personName);
        System.out.println("Nuestra persona es: " + persona);
        return persona;
    }

    @Bean("pabloName")
    public String name(){
        return "Pablo";
    }

    @Bean("name")
    public String name2(){
        return "Jose Jose";
    }
}

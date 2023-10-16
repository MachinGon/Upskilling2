package com.example.demo2.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Person {

    String name; //despues
    private final JobInterface job;

    @Autowired
    public Person(@Qualifier("fireMan") JobInterface job, String name){
        this.job = job;
        this.name = name;

        System.out.println(this);
    }

    @Override
    public String toString(){
        return "Name: "+this.name + ", Job:"+this.job;

    }
}

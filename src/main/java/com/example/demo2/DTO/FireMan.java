package com.example.demo2.DTO;

import org.springframework.stereotype.Service;

@Service
public class FireMan implements JobInterface{

    @Override
    public void myJob() {
        System.out.println("I work as fireman");
    }
}

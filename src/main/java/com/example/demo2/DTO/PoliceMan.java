package com.example.demo2.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //como componente, crea un bean pero te ayuda a diferenciar, este es para Service
//@Service destinado para logica de negocio
public class PoliceMan implements JobInterface{

    @Override
    public void myJob() {
        System.out.println("I work as policeman");
    }
}

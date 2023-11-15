package com.example.demo2.service;

import com.example.demo2.DAO.PersonaRepository;
import org.springframework.stereotype.Service;

@Service
public class RestServices {
    private final PersonaRepository personRepo;

    public RestServices(PersonaRepository personRepo) {
        this.personRepo = personRepo;
    }
}

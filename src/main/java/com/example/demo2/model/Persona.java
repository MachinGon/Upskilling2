package com.example.demo2.model;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;
    @Column(name = "name")
    private String name;


    public Long getPersonId() {
        return idPersona;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "persona{" +
                "idPersona=" + idPersona +
                ", name='" + name + '\'' +
                '}';
    }
}

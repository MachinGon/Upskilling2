package com.example.demo2.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private Long idPersona;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="compra", targetEntity = Compra.class)
    public Set<Compra> compras;

    @Override
    public String toString() {
        return "persona{" +
                "idPersona=" + idPersona +
                ", name='" + name + '\'' +
                '}';
    }
}

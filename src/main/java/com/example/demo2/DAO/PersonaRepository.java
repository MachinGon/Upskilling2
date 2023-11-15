package com.example.demo2.DAO;

import com.example.demo2.model.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonaRepository extends CrudRepository<Persona, Long> {
    List<Persona> findByName(String name);
    Optional<Persona> findByIdPersona(Long id);

}

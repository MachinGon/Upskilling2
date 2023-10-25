package com.example.demo2.DAO;

import java.util.List;
import com.example.demo2.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByName(String name);
    Person findById(long id);

}

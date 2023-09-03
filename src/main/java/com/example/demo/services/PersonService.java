package com.example.demo.services;

import com.example.demo.model.Person;
import com.example.demo.model.repositories.PersonRepo;

import java.util.Optional;

public interface PersonService {
    Optional<Person> getPersonById(Long id) ;
    void createPerson(Person p) ;

    void updatePerson(Person p);

    void deletePerson(Long id) ;

    Person getByVille(String ville) ;
}

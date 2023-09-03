package com.example.demo.services.impl;

import com.example.demo.model.Person;
import com.example.demo.model.repositories.PersonRepo;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService {
    @Autowired
    private PersonRepo personRepo ;
    @Override
    public Optional<Person> getPersonById(Long id) {

        return personRepo.findById(id) ;
    }

    @Override
    public void createPerson(Person p) {
      personRepo.save(p);
    }

    @Override
    public void updatePerson(Person p) {

    }

    @Override
    public void deletePerson(Long id) {

    }

    @Override
    public Person getByVille(String ville) {
        return personRepo.getByVille(ville);
    }
}

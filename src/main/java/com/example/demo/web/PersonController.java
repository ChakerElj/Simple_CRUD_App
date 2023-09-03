package com.example.demo.web;


import com.example.demo.model.Person;
import com.example.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    PersonService personService ;

    @GetMapping("/api/getPerson/{id}")
    public String getPerson(@PathVariable Long id){
        if (personService.getPersonById(id).isEmpty()){
            throw new RuntimeException("Person not found") ;
        }
        return personService.getPersonById(id).get().toString() ;
    }
    @PostMapping("/api/makePerson")
    public void makePerson(@RequestBody Person person) {
        personService.createPerson(person);
    }

    @GetMapping("/api/getByVille/{ville}")
    public ResponseEntity<Person>  getPersonByVille(@PathVariable String ville) {
        if (personService.getByVille(ville) == null) {
            throw new RuntimeException("person not found with ville " + ville) ;
        }
        return new ResponseEntity<>(personService.getByVille(ville), HttpStatus.OK) ;
    }

}

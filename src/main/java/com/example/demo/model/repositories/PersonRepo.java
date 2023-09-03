package com.example.demo.model.repositories;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepo extends JpaRepository<Person, Long> {
    @Query("SELECT p from Person p where p.ville =:villeName")
    Person getByVille(@Param("villeName")String villeName) ;
}

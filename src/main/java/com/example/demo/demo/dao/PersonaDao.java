package com.example.demo.demo.dao;

import com.example.demo.demo.module.Person;

import java.util.UUID;

public interface PersonaDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}

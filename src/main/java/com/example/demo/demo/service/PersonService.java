package com.example.demo.demo.service;

import com.example.demo.demo.dao.PersonaDao;
import com.example.demo.demo.module.Person;

public class PersonService {

    private final PersonaDao personaDao;

    public PersonService(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    public int addPerson(Person person){
        return personaDao.insertPerson(person);
    }
}

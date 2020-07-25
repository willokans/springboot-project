package com.example.demo.demo.service;

import com.example.demo.demo.dao.PersonaDao;
import com.example.demo.demo.module.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonaDao personaDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    public int addPerson(Person person){
        return personaDao.insertPerson(person);
    }
}

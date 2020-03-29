package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.repos.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public Person savePerson(Person person) {

        return personRepository.save(person);
    }

}

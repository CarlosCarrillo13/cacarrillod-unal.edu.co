package com.example.demo.controller;


import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/save")
    public ResponseEntity<Person> savePerson(@RequestBody Person person) {

        Person response = personService.savePerson(person);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}

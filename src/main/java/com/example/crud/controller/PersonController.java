package com.example.crud.controller;


import com.example.crud.entity.Person;
import com.example.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService service;



    @PostMapping("/addPerson")
    public Person addPerson(@RequestBody Person person) {

        return service.savePerson(person);
    }
    @PostMapping("/addPersons")
    public List<Person> addPersons(@RequestBody List<Person> persons) {

        return service.savePersons(persons);
    }



    @GetMapping("/person")
    public List<Person> findAllPerson() {

        return service.getPerson();
    }

    @GetMapping("/personById/{id}")
    public Person findPersonById(@PathVariable Long id) {
        return service.getPersonById(id);
    }

    @GetMapping("/person/{name}")
    public Person findPersonByName(@PathVariable String name) {

        return service.getPersonByName(name);
    }

    @PutMapping("/update")
    public Person updatePerson(@RequestBody Person person) {

        return service.updatePerson(person);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePerson(@PathVariable Long id) {

        return service.deletePerson(id);
    }
}

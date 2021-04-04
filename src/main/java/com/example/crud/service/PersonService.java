package com.example.crud.service;


import com.example.crud.entity.Person;
import com.example.crud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository repository;

    public Person savePerson(Person person) {

        return repository.save(person);
    }

    public List<Person> savePersons(List<Person> persons) {

        return repository.saveAll(persons);
    }

    public List<Person> getPerson() {

        return repository.findAll();
    }

    public Person getPersonById(Long id) {

        return repository.findById(id).orElse(null);
    }

    public Person getPersonByName(String name) {
        return repository.findByName(name);
    }

    public String deletePerson(Long id) {
        repository.deleteById(id);
        return "person removed !! " + id;
    }

    public Person updatePerson(Person person) {
        Person existingPerson = repository.findById(person.getId()).orElse(null);
        existingPerson.setName(person.getName());

        return repository.save(existingPerson);
    }


}

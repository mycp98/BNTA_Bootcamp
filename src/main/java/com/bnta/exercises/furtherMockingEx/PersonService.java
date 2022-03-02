package com.bnta.exercises.furtherMockingEx;

import java.util.List;
import java.util.Optional;

public class PersonService {
    private final PersonDAO personDAO;   //here we accept the interface, so we can pass any class that interacts with this interface

    //Constructor
    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }
    //method savePerson (diff than in PersonDAO interface)
    public void savePerson(Person person) {
        if (person.getAge() == null ||
                person.getId() == null ||
                person.getName().length() == 0) {
            throw new IllegalStateException("Person cannot have empty fields");
        }
        boolean exists = doesPersonWithIdExists(person.getId());

        if (exists) {
            throw new IllegalStateException("person with id " + person.getId() + " already exists");
        }

        personDAO.savePerson(person);

    }

    //method deletePerson
    public void deletePerson(int id) {
        boolean exists = doesPersonWithIdExists(id);
        if (!exists) {
            throw new IllegalStateException("person with id " + id + " not found");
        }
        personDAO.deletePerson(id);
    }

    //made a list (of Persons)  called "getPeople"
    public List<Person> getPeople() {
        return personDAO.getPeople();
    }

    public Optional<Person> getPersonById(int id) {
        return personDAO
                .getPeople()
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    private boolean doesPersonWithIdExists(Integer id) {
        return personDAO
                .getPeople()
                .stream()
                .anyMatch(p -> p.getId().equals(id));
    }
}

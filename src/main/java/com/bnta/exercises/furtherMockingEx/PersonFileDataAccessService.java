package com.bnta.exercises.furtherMockingEx;

import java.util.List;

public class PersonFileDataAccessService implements PersonDAO {

    @Override
    public void savePerson(Person person) {
        //when i save a person
        //get from introtofiles? exercise    or FileWriter
        //add try and catch
        //printWriter.println(person
        //I want to append to the file instead of overwriting the conten
        // saves to a file
        //overriding void savePerson(Person........from Interface
    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        return List.of(); //return empty list for now
    }

    @Override
    public Person getPersonBy(int id) {
        return null;  //do by yourself
    }
}

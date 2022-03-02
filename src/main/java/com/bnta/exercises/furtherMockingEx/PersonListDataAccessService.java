package com.bnta.exercises.furtherMockingEx;

import java.util.List;
//implementation for PersonDAO:
public class PersonListDataAccessService implements PersonDAO {



    @Override
    public void savePerson(Person person) {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        return null;
        //return db;
    }

    @Override
    public Person getPersonBy(int id) {
        return null;
    }
}

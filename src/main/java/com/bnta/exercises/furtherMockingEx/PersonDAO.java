package com.bnta.exercises.furtherMockingEx;

import java.util.List;

public interface PersonDAO {

    void savePerson(Person person);

    void deletePerson(int id);

    List<Person> getPeople();

    Person getPersonBy(int id);
}

//our interface can have many implementations
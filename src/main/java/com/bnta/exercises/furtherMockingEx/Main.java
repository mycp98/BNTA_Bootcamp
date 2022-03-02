package com.bnta.exercises.furtherMockingEx;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        // to connect everything
        //need to have an instance of the personService
        //PersonDAO personDAO = new PersonFileDataAccessService():
        //PersonService personService = new PersonService(personDAO); <---can now put in personDAO in brackets
        //


        Person marcy = new Person(1, "Marcy", 23);
        Person hajr = new Person(2, "Hajr", 24);
        Person suad = new Person(3, "Suad", 24);
        people.add(marcy);
        people.add(hajr);
        people.add(suad);



        for(Person person : people){
            //person.savePerson();
        }
    }
}

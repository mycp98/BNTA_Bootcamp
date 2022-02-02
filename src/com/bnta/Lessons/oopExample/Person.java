package com.bnta.Lessons.oopExample;
// We are making a Person Class (template for multiple people/objects)
//From a Person Class, we can create multiple people objects
//Person class : Properties/Characteristics - name, age, skin colour, gender etc
//               Behaviours - how happy they are feeling, what they sound like


public class Person {

    static int count = 0;
    //Properties:
    //private Type propertyName     //private because you don't want anyone to have direct access to your properties
    private String name;
    private int age;
    private SkinColour skinColour; //The datatype is SkinColour
    private String nationality;

    //The constructor allows us to set the initial values for any given object, can have as many properties as you'd like
    //Constructor:           Command N


    public Person(String name, int age, SkinColour skinColour, String nationality) {
        this.name = name;
        this.age = age;
        this.skinColour = skinColour;
        this.nationality = nationality;
        count++;
    }

    public Person(){
        count++;
    }    //This is the default constructor for when you have no other constructors

    public Person(String name) {   //constructor with just name string
        this.name = name;
        count++;
    }

    public Person(String name, String nationality) {    //Constructor for just the 2 properties: name and nationality
        this.name = name;
        this.nationality = nationality;
        count++;
    }

    //Getters used to get the particular property value, method for returning those properties
    //Setters allow us to set values
    //Getters & Setters:


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SkinColour getSkinColour() {
        return skinColour;
    }

    public void setSkinColour(SkinColour skinColour) {
        this.skinColour = skinColour;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    //Used to print the string representation of an Object
    //ToString:
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skinColour=" + skinColour +
                ", nationality='" + nationality + '\'' +
                '}';
    }




}

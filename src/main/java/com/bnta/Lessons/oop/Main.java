package com.bnta.Lessons.oop;

//In the Main, we create our objects from the Class
public class Main {

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        //Creating our first object/person
        //Class objectName = new Class        Person(String name, int age, SkinColour skinColour, String nationality)
        Person marcy = new Person(
                "Marcy",23, SkinColour.BROWN, "British");

        //Second person
        Person maya = new Person("Maya", 23, SkinColour.WHITE, "British");

        Person patricia = new Person();
        patricia.setName("Patricia");
        patricia.setNationality("Bolivian");



//        new Person();   //from default
//        new Person("Michael"); //from constructor with just name
        Person michael = new Person("Michael");
        System.out.println(michael);



        System.out.println("-------------");
        System.out.println(marcy);
        System.out.println("-------------");
        System.out.println(marcy.getName() + " is " + marcy.getAge() + " years old");
        System.out.println("-------------");

        //another way to create object person
        Person alimaa = new Person();
        alimaa.setName("Alimaa");
        alimaa.setAge(22);
        alimaa.setSkinColour(SkinColour.BROWN);

        System.out.println(alimaa.getName());
        System.out.println(alimaa.getAge());
        System.out.println(alimaa.getSkinColour());
        System.out.println("-------------");

        System.out.println(Person.count);  //How many people we've created: 5
        System.out.println("-------------");

        // Now we can create a house object:
        //1) create address:
        Address address = new Address("34 Monson Road", "NW10 5UP", "London");
        //2) create house object:
        House house = new House(address, HouseSize.XL, 4, new Person[] {marcy, patricia});

        System.out.println(house);

        System.out.println("-------------");
        //System.out.println(Arrays.toString(new int[]{1}));

    }
}

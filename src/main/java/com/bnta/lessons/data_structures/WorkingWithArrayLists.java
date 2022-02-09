package com.bnta.lessons.data_structures;

import com.bnta.exercises.week_three_tue.reading_files.ex9b_usingClasses.Person;

import java.util.ArrayList;

public class WorkingWithArrayLists {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add("2");
        //list.add(new Person());  //our list contains different data types
        list.add(3.14);  //double
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());   //3 because we've removed
        System.out.println(list.contains(1));  //false
        list.clear();  //removed all elements
        System.out.println(list.isEmpty());  //true
        System.out.println(list.size());   //size is now 0
        //list.add  always adds to the end
        //list.set(int index, Object object)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // e is the element, now have access to the element/index
        list.forEach(e -> {
            System.out.println("e = " +e);
        });
        System.out.println("------------");
        //OR:
        for(Object e : list){
            System.out.println("e = " + e);    //sout v
        }

        System.out.println("------------");
        //Can also use this but very rarely
        for (int i = 0; i < list.size(); i++) {
   //         System.out.println(list[i]);      doesn't work for lists, we suse isntead:
            System.out.println(list.get(i));
        }

        System.out.println("------------");
        //find index of a particular object:
        System.out.println(list.get(1));  // <--- check

    }

    //using generic types:

}

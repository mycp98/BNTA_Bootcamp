package com.bnta.exercises.week_four_tue.data_structures;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
//        HashMap<String, Integer> map = new HashMap<>();//<key is String, value is Integer>
//        map.put("Marcy", 1);
//        System.out.println(map);
//        System.out.println(map.get("Marcy"));

        HashMap<Integer, String > map = new HashMap<>();
        map.put(1, "Marcy");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.isEmpty());

    }
}

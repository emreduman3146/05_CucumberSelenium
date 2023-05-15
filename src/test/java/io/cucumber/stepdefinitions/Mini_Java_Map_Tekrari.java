package io.cucumber.stepdefinitions;

import java.util.HashMap;
import java.util.Map;

public class Mini_Java_Map_Tekrari
{
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");
        map.put(3, "value3");

        readTheMap_via_structuralProgramming(map);
        System.out.println("====================");
        readTheMap_via_functionalProgramming(map);




    }

    private static void readTheMap_via_structuralProgramming(Map<Integer, String> map) {

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
    }

    private static void readTheMap_via_functionalProgramming(Map<Integer, String> map) {

        map.forEach((key, value) -> {
            System.out.println("Key: " + key + " Value: " + value);
        });
    }
}



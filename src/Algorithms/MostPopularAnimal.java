package Algorithms;

import java.util.*;

public class MostPopularAnimal {
    public static void main(String[] args) {
        //get most popular animal from the array
        String[] animals = new String[]{"dog", "cat", "fish", "cat", "dog", "cat", "dog"};
        System.out.println(getMostPopularAnimal(animals));
    }

    public static String getMostPopularAnimal(String[] animals) {
        if (animals.length == 0) {
            return "Array is empty";
        }
        //assuming that if we have multiply animals with the same quantity of occurrences,
        //we will return first animal.
        int counter = 0;
        String result = "";
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : animals) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
                if (map.get(s) > counter) {
                    result = (String) map.keySet().toArray()[0];
                } else {
                    result = animals[0];
                }
            } else {
                map.put(s, 1);
            }
        }
        return result;
    }
}
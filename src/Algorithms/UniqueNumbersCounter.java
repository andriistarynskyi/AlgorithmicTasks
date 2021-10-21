package Algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumbersCounter {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 3, 3, 3);
        System.out.println(countUniqueNumbers(list));
    }

    public static Integer countUniqueNumbers(List<Integer> list) {
        Integer counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                counter++;
            }
        }
        return counter;
    }
}
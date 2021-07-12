package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserStats {
    public static void main(String[] args) {

//        collect stats in a new map, skip entries with keys which cannot be parsed to longs and zero values
        List<Map<String, Integer>> list = new ArrayList<>();
        list.add(new HashMap<>(Map.of("123", 45, "124", 46, "146", 0)));
        list.add(new HashMap<>(Map.of("222", 46, "123", 52, "146", 0)));
        list.add(new HashMap<>(Map.of("334", 25, "222M", 34, "225", 100)));

        System.out.println(userStatsCounter(list));
    }

    public static Map<Long, Long> userStatsCounter(List<Map<String, Integer>> maps) {
        Map<Long, Long> stats = new HashMap<>();
        Long tempKey, tempValue;

        for (Map<String, Integer> m : maps) {
            for (Map.Entry<String, Integer> mapElem : m.entrySet()) {
                if (mapElem.getKey().matches("[0-9]+") && mapElem.getKey().length() > 2) {

                    tempKey = Long.parseLong(mapElem.getKey());
                    tempValue = Long.valueOf(mapElem.getValue());

                    if (tempValue != 0) {
                        if (!stats.containsKey(tempKey)) {
                            stats.put(tempKey, tempValue);
                        } else {
                            stats.put(tempKey, stats.get(tempKey) + tempValue);
                        }
                    }
                }
            }
        }
        return stats;
    }
}
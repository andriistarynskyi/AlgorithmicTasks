package Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElemCounter {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3, 5, 5, 5, 5, 6, 89, 110, 10);
        System.out.println(getUniqueElemCount(ints));
    }

    public static int getUniqueElemCount(List<Integer> ints) {
        if (ints == null || ints.isEmpty()) {
            return 0;
        } else {
            return new HashSet<>(ints).size();
        }
    }
}
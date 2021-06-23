package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxValueGenerator {
    public static void main(String[] args) {
        // create solution which will pick the largest number N by inserting any digit into N number;
        // generated number should not be greater than maxValue.
        // assume that all numbers will be > 0.

        System.out.println(getNum(268, 8000, 5));
        System.out.println(getNum(670, 8000, 5));
        System.out.println(getNum(0, 8000, 5));
        System.out.println(getNum(999, 8000, 5));
    }

    private static Integer getNum(int num, int maxValue, int addDigit) {
        String numStr = String.valueOf(num);
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numStr.length(); i++) {
            int tempInt = concatNum(num, i, addDigit);
            if (tempInt < maxValue) {
                integers.add(tempInt);
            }
        }
        return Collections.max(integers);
    }

    private static int concatNum(int num, int index, int addDigit) {
        String numStr = String.valueOf(num);
        String resultStr = numStr.substring(0, index).concat(String.valueOf(addDigit)
                .concat(numStr.substring(index)));
        return Integer.parseInt(resultStr);
    }
}
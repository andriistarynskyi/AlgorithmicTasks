package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        //program which return "fizz" if the number is a multiplier of 3, return "buzz"
        // if its multiplier of 5 and return "fizzbuzz" if the number is divisible by both 3 and 5.
        // If the number is not divisible by either 3 or 5 then it should just return the number itself

        //Time Complexity: O(N);
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!(i % 3 == 0 || i % 5 == 0)) {
                strings.add(String.valueOf(i));
            } else if ((i % 3 == 0) && (i % 5 == 0)) {
                strings.add("FizzBuzz");
            } else if (i % 5 == 0) {
                strings.add("Buzz");
            } else if (i % 3 == 0) {
                strings.add("Fizz");
            }
        }
        return strings;
    }
}
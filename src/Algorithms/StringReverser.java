package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverser {
    public static void main(String[] args) {
        //reverse words in the string;

        String str = "this is string";
        System.out.println(str);
        System.out.println(getReversedString(str));
    }

    public static String getReversedString(String str) {
        if (!str.isEmpty() || !str.isBlank()) {
            List<String> words = Arrays.stream(str.split(" ")).collect(Collectors.toList());
            StringBuilder sb = new StringBuilder();
            for (int i = words.size() - 1; i >= 0; i--) {
                sb.append(words.get(i)).append(" ");
            }
            return sb.toString();
        } else {
            return str;
        }
    }
}
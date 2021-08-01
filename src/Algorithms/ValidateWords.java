package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateWords {
    public static void main(String[] args) {
        //return the list of words which can be made out only one row of letters

        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.stream(solution(words)).toList());
    }

    public static String[] solution(String[] words) {
        List<String> result = new ArrayList<>();
        String firstRow = "qwertyuiop"; // 1st row on keyboard
        String secondRow = "asdfghjkl"; // 2nd row on keyboard
        String thirdRow = "zxcvbnm"; // 3rd row on keyboard
        String currentRow = "";
        for (int i = 0; i < words.length; i++) {
            String ch = String.valueOf(words[i].toLowerCase().charAt(0));
            if (firstRow.contains(ch)) {
                currentRow = firstRow;
            } else if (secondRow.contains(ch)) {
                currentRow = secondRow;
            } else if (thirdRow.contains(ch)) {
                currentRow = thirdRow;
            }
            if (validateStr(currentRow, words[i].toLowerCase())) {
                result.add(words[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static boolean validateStr(String row, String word) {
        for (char ch : word.toCharArray()) {
            if (!row.contains(String.valueOf(ch))) {
                return false;
            }
        }
        return true;
    }
}

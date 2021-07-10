package Algorithms;

import java.util.*;

public class ScrambleGame {
    public static void main(String[] args) {
//        Algorithm task:
//        We have a list of letters and we need to check whether the word can be created based on this list:
//        Letters can be reused
//        Letters cannot be reused (we need to count the number of words available)
//        There is a wildcard - *, that can replace any letter. Rule #2 applies to this task as well
//        Method should return true or false
        Character wildCard = '*';
        List<Character> chars = new ArrayList<>(Arrays.asList('d', 'o', 'r', wildCard));
        String testWord = "door";
        System.out.println(isWordCreatable(chars, testWord, wildCard));
    }

    public static boolean isWordCreatable(List<Character> chars, String word, Character wildCard) {
        Map<Character, Integer> map = new HashMap<>();
        boolean bool = false;
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character c : word.toCharArray()) {
            if (!map.containsKey(c) || chars.size() == 0) {
                return false;
            } else if (map.containsKey(c) && map.get(c) != 0) {
                map.put(c, map.get(c) - 1);
                bool = true;
            } else if (map.containsKey(wildCard) && map.get(wildCard) != 0) {
                map.put(wildCard, map.get(wildCard) - 1);
                bool = true;
            } else if (map.get(c) == 0) {
                return false;
            } else {
                bool = false;
            }
        }
        return bool;
    }
}
package Algorithms;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {
        // get most popular word from paragraph

        String paragraph = "Bob. hIt, baLl";
        String[] wordsToExclude = new String[]{"bob", "hit"};
        System.out.println(solution(paragraph, wordsToExclude));
    }

    public static String solution(String paragraph, String[] banned) {
        String[] text = paragraph.toLowerCase()
                .replaceAll("[^a-zA-Z]+", " ")
                .split(" ");
        Map<String, Integer> map = new HashMap<>();
        Set<String> stopWords = new HashSet<>();
        int max = Integer.MIN_VALUE;
        String mostPopularWord = "";

        for (String s : banned) {
            stopWords.add(s);
        }
        for (String s : text) {
            if (!stopWords.contains(s)) {
                map.put(s, map.getOrDefault(s, 0) + 1);
                if (map.get(s) > max) {
                    max = map.get(s);
                    mostPopularWord = s;
                }
            }
        }
        return mostPopularWord;
    }
}

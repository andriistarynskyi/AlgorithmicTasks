package Algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class TextAssessment {
//    ths task was taken from this web-site
//    https://aonecode.com/amazon-online-assessment-oa2-the-most-frequently-used-word

//    Company is partnering with the linguistics department at a local university
//    to analyze important works of English literature and identify patterns in word usage
//    across different eras. To ensure a cleaner output.
//    the linguistics department has provided a list of commonly used words (e.g., “an”, “the”. etc.)
//    to exclude from the analysis.
//    In the context of this search, a word is an alphabetic sequence of characters having no whitespace
//    or punctuation.
//
//    Write an algorithm to find the most frequently used word in the text excluding the commonly used words.
//
//    Input:
//    The input to the function/method consists of two arguments:
//    literatureText: a string representing the block of text,
//    wordsToExclude: a list of strings representing the commonly used words to be excluded
//    while analyzing the word frequency.
//
//    Output:
//    Return a list of strings representing the most frequently used word in the text or in case of a tie,
//    all of the most frequently used words in the text..
//
//    Note:
//    Words that have a different case are counted as the same word. The order of words does not matter
//    in the output list. All words in the ‘wordsToExclude’ list are unique.
//    Punctuation should be treated as white space.
//
//    Example
//    Input :
//    literature Text = “Jack and Jill went to the market to buy bread and cheese.
//    Cheese is Jack’s and Jill’s favorite food.”
//    wordsToExclude = [“and”, “he”, “the”, “to”, “is”. “Jack”, “Jill”]
//    Output :
//   [“cheese”, “s”]
//
//    Explanation : The word `and" has a maximum of three frequency but this word should be excluded
//    while analyzing the word frequency. The words “Jack’. 'Jill”, “s”, “to” and “cheese” have the next maximum
//    frequency(two) in the given text but the words “Jack”, “to” and "Jill’ should be excluded as
//    these are commonly used words which you are not interested to include.

    public static void main(String[] args) {
        String text = "Jack and Jill went to the market to buy bread and cheese. " +
                "Cheese is Jack’s and Jill’s favorite food.";
        List<String> wordsToExclude = Arrays.asList("and", "he", "the", "to", "is", "Jack", "Jill");

        System.out.println(getMostPopularWords(text, wordsToExclude));
    }

    public static List<String> getMostPopularWords(String text, List<String> wordsToExclude) {

        //replace all punctuation with spaces
        String[] words = text.replaceAll("[^a-zA-Z0-9]", " ").split(" ");

        //add words to exclude to the map with negative values;
        Map<String, Integer> map = new HashMap<>(putWordsTpExclude(wordsToExclude));

        //add words from text and count occurrences
        for (String word : words) {
            if (word.isEmpty() || word.isBlank() || map.containsKey(word) && map.get(word) < 0) {
                continue;
            } else if (map.containsKey(word.toLowerCase()) && map.get(word.toLowerCase()) > 0) {
                map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
            } else {
                map.put(word, 1);
            }
        }

        int maxValue = getMaxValue(map);
        map.values().removeIf(x -> x < maxValue);
        return new ArrayList<>(map.keySet());
    }

    public static Map<String, Integer> putWordsTpExclude(List<String> wordsToExclude) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : wordsToExclude) {
            map.put(word, -1);
        }
        return map;
    }

    public static int getMaxValue(Map<String, Integer> map) {
        int max = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }
}
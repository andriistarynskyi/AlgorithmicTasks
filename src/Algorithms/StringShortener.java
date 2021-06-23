package Algorithms;

public class StringShortener {
    public static void main(String[] args) {
        //create solution which will allow to shorten string by removing consecutive duplicated chars
        //(case-insensitive)
        //example: function should generate 'ab' from 'AaBb'.
        System.out.println(getShortenedString("Abbbc"));
    }

    public static String getShortenedString(String str) {
        StringBuilder shortenedString = new StringBuilder();
        char[] chars = str.toLowerCase().toCharArray();

        if (str.length() < 2) {
            return str.toLowerCase();
        }
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                shortenedString.append(chars[i]);
            } else {
                if (chars[i] != chars[i - 1]) {
                    shortenedString.append(chars[i]);
                }
            }
        }
        return shortenedString.toString();
    }
}
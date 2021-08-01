package Algorithms;

public class ReverseStringTwo {
    public static void main(String[] args) {
        // reverse only letters in the string
        String input = "ab-cd-ef";
        // Output: "dc-ba"
        System.out.println(solution(input));
    }

    public static String solution(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        char tempChar;
        while (left < right) {
            if(!Character.isLetter(chars[left])) {
                left++;
            } else if(!Character.isLetter(chars[right])) {
                right--;
            } else {
                tempChar = chars[left];
                chars[left] =  chars[right];
                chars[right] = tempChar;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }
}
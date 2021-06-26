package Algorithms;

public class ReverseNumber {
    public static void main(String[] args) {
        //create solution which will check if number is palindrome (121 is palindrome)

        int num = 123456789;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        long reversedX = Long.parseLong(new StringBuilder(String.valueOf(x))
                .reverse()
                .toString()
                .replace("-", ""));
        if(reversedX >= Integer.MAX_VALUE) {
            return false;
        } else if(x >= 0) {
            return x == (int) reversedX;
        } else {
            return false;
        }
    }
}
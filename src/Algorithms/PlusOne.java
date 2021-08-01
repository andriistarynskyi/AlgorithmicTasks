package Algorithms;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //add one to the number
        int[] digits = new int[]{1, 2, 9, 9, 9};
        System.out.println(Arrays.toString(solution(digits)));
    }

    public static int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
            if (digits[0] == 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                return result;
            }
        }
        return digits;
    }
}
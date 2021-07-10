package Algorithms;

public class ReverseString {
    public static void main(String[] args) {
        //create solution that will reverse string given in the array format;
        //additional data structures should be used;

        String[] input = {"h", "e", "l", "l", "o"};

        for (String str : strReverser(input)) {
            System.out.println(str);
        }
    }

    public static String[] strReverser(String[] input) {
        if (input.length != 0 && input.length != 1) {
            for (int i = 0; i < input.length / 2; i++) {
                String tempStr = input[i];
                input[i] = input[input.length - i - 1];
                input[input.length - i - 1] = tempStr;
            }
        }
        return input;
    }
}
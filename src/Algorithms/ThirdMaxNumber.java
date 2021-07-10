package Algorithms;

public class ThirdMaxNumber {
    public static void main(String[] args) {
//        find third largest number from array
        int[] arr = {5, 3, 2, 11};
        System.out.println(getThirdLargestNumber(arr));
    }

    public static int getThirdLargestNumber(int[] ints) {
        int maxNumOne = Integer.MIN_VALUE;
        int maxNumTwo = Integer.MIN_VALUE;
        int maxNumThree = Integer.MIN_VALUE;

        for (int j : ints) {
            if (j > maxNumOne) {
                maxNumThree = maxNumTwo;
                maxNumTwo = maxNumOne;
                maxNumOne = j;
            } else if (j > maxNumTwo) {
                maxNumThree = maxNumTwo;
                maxNumTwo = j;
            } else if (j > maxNumThree) {
                maxNumThree = j;
            }
        }
        return maxNumThree;
    }
}
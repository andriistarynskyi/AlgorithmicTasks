package Algorithms;


public class TwoNumbers {
    public static void main(String[] args) {
        //find pair of numbers which will be equal to target, assume that only one pair exist
        //given array of ints is sorted
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        for (int i : twoSum(arr, target)) {
            System.out.println(i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (nums[i] + nums[j] != target) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{i + 1, j + 1};
    }
}
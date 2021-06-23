package Algorithms;

import java.util.*;

public class TwoSum {

    // Given an array of integers nums and an integer target,
    // return indices of the numbers such that they add up to target.

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 56, 7, 8, 10};
        int target = 59;

        System.out.println(getSum(nums, target));
        System.out.println(getTwoSum(nums, target));
    }

    //Time complexity O(2n);
    public static String getSum(int[] intArr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArr.length; i++) {
            map.put(intArr[i], i);
        }

        for (int j = 0; j < intArr.length; j++) {
            int num = target - intArr[j];
            if (map.containsKey(num) && map.get(num) != j) {
                return Arrays.toString(new int[]{j, map.get(num)});
            }
        }
        throw new IllegalArgumentException("No solution available");
    }

    //Time complexity O(n ^ 2);
    public static String getTwoSum(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return Arrays.toString(new int[]{i, j});
                }
            }
        }
        throw new IllegalArgumentException("No solution available");
    }
}

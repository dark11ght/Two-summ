package com.shakhrai.pavel.java.twosumm;

import java.util.HashMap;
import java.util.Map;

public class TwoSumm {
    /** Two Sum
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example1:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * Example2:
     * Given nums = [2, 16, 9, 11, 5], target = 14,
     * Because nums[2] + nums[4] = 9 + 5 = 14,
     * return [2, 4].
     */

//    public int[] twoSum(int[] nums, int target) {
//        //write code here
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num2 = target - nums[i];
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(num2), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("match not found");
    }
}

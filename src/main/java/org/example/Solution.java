package org.example;

public class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int max = result;
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i], max + nums[i]);
            result = Math.max(max, result);
        }
        return result;
    }
}

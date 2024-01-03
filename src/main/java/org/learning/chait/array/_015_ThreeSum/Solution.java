package org.learning.chait.array._015_ThreeSum;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class Solution {

    /**
     *
     * We need to sort the array.
     *
     * Then for every element while traversing, perform 2 sum II on the remaining array
     *
     * In the match block, have a logic to move the left pointer to the next distinct element.
     *
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // sort the array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // check for duplicate and proceed
            if( i > 0 && nums[i] == nums[i-1] ) {
                continue;
            }

            int left = i+1, right = nums.length-1;
            while(left < right) {
                if( nums[i] + nums[left] + nums[right] > 0 ) {
                    right -= 1;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left += 1;
                }else {
                    // this is the match block
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // this block is to update the pointer after adding
                    left += 1;
                    while(nums[left] == nums[left-1] && left < right) {
                        left += 1;
                    }
                }
            }
        }
        return result;
    }
}

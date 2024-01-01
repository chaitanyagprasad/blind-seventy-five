package org.learning.chait.array;

import java.util.*;

/**
 * Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {

    /**
     * We know that x + y = target
     * Since x and y are distinct, we can assume y = target - x.
     * Use a hashtable to keep track of seen `x` while traversing.
     */

    public static int[] solution(int[] nums, int target){
        Set<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int i, x, y=0, j;
        for ( i = 0; i < nums.length; i++) {
            x = nums[i];
            y = target - x;
            if( seen.contains(y) ) {
                break;
            }else {
                seen.add(x);
            }
        }
        result[0] = i;
        for (j = 0; j <nums.length; j++) {
            if( nums[j] == y ) {
                break;
            }
        }
        result[1] = j;
        return result;
    }

}

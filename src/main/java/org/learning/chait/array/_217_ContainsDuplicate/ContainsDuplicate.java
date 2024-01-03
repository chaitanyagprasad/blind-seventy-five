package org.learning.chait.array._217_ContainsDuplicate;

import java.util.*;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class ContainsDuplicate {

    /**
     * Have a Set `seen`.
     * Iterate over input array. If the element is present in `seen`, return false.
     */
    public static boolean solution(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num:nums) {
            if(seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}

package org.learning.chait.array._217_ContainsDuplicate;

import java.util.*;

public class ContainsDuplicatePractice {
    public boolean containsDuplicate(int[] nums) {
        // TODO Auto-generated method stub
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if( seen.contains(nums[i]) ){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
}

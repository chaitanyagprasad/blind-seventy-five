package org.learning.chait.array._001_TwoSum;

import java.util.*;

public class Practice {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int i, x , y = 0;
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
        for (int j = 0; j < nums.length; j++) {
            if( y == nums[j] ) {
                result[1] = j;
                break;
            }
        }

        return result;
    }
}

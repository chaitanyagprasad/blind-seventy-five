package org.learning.chait.array._015_ThreeSum;

import java.util.*;

public class Practice {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if( i > 0 && nums[i-1] == nums[i] ) {
                continue;
            }

            int left = i + 1;
            int right = nums.length-1;

            while( left < right ) {

                if(nums[i] + nums[left] + nums[right] > 0) {
                    right -= 1;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left +=1;
                }else {
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left +=1;
                    while( nums[left] == nums[left-1] && left < right ) {
                        left +=1;
                    }
                }
            }
        }


        return result;
    }

}

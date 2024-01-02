package org.learning.chait.array._167_TwoSumII;

public class Practice {

    public static int[] twoSumII(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0, right = nums.length-1;
        while( left < right ) {
            int temp = nums[left] + nums[right];

            if( temp > target ) {
                right -= 1;
            } else if (temp < target) {
                left +=1;
            }else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }

        }
        return result;
    }

}

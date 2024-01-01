package org.learning.chait.array;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2]
 * where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 *
 * Your solution must use only constant extra space.
 */
public class TwoSumII {

    /**
     * Have 2 pointers: left and right
     *
     * sum numbers[left] + numbers[right] = temp
     *
     * if temp > target then decrease right pointer
     *
     * else increase left pointer
     */
    public static int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0, right = numbers.length-1;
        while(left < right) {
            if( numbers[left] + numbers[right] > target ) {
                right -= 1;
            }else if(numbers[left] + numbers[right] < target) {
                left += 1;
            }else {
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
        }

        return result;
    }
}

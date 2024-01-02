package org.learning.chait.array._001_TwoSum;

import org.junit.*;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class SolutionTest {

    @Test
    public void testTwoSum() {
        int[] i1 = new int[]{2,7,11,15};
        int[] o1 = new int[]{0,1};
        assertThat(Solution.twoSum(i1, 9)).contains(o1);

        int[] i2 = new int[]{3,2,4};
        int[] o2 = new int[]{1,2};
        assertThat(Solution.twoSum(i2, 6)).contains(o2);

        int[] i3 = new int[]{3,3};
        int[] o3 = new int[]{0,1};
        assertThat(Solution.twoSum(i3, 6)).contains(o3);
    }
}
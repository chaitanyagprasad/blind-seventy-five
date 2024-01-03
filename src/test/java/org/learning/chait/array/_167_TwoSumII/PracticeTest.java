package org.learning.chait.array._167_TwoSumII;

import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;


public class PracticeTest {

    @Test
    public void testTwoSumII() {
        int[] i1 = new int[]{2,7,11,15};
        int[] o1 = new int[]{1,2};
        assertThat(Practice.twoSumII(i1, 9)).contains(o1);

        int[] i2 = new int[]{2,3,4};
        int[] o2 = new int[]{1,3};
        assertThat(Practice.twoSumII(i2, 6)).contains(o2);

        int[] i3 = new int[]{-1,0};
        int[] o3 = new int[]{1,2};
        assertThat(Practice.twoSumII(i3, -1)).contains(o3);
    }
}
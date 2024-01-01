package org.learning.chait.array;

import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;


public class TwoSumTest {

    @Test
    public void testBruteForce() {
        int[] i1 = new int[]{2,7,11,15};
        int[] o1 = new int[]{0,1};
        assertThat(TwoSum.solution(i1, 9)).contains(o1);

        int[] i2 = new int[]{3,2,4};
        int[] o2 = new int[]{1,2};
        assertThat(TwoSum.solution(i2, 6)).contains(o2);

        int[] i3 = new int[]{3,3};
        int[] o3 = new int[]{0,1};
        assertThat(TwoSum.solution(i3, 6)).contains(o3);
    }
}
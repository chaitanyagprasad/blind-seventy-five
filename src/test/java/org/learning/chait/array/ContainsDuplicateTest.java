package org.learning.chait.array;

import org.junit.*;

import static org.assertj.core.api.Assertions.assertThat;


public class ContainsDuplicateTest {

    @Test
    public void testSolution() {
        assertThat(ContainsDuplicate.solution(new int[]{1,2,3,1})).isTrue();
        assertThat(ContainsDuplicate.solution(new int[]{1,2,3,4})).isFalse();
        assertThat(ContainsDuplicate.solution(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue();

    }
}
package org.learning.chait.array._217_ContainsDuplicate;

import org.junit.*;
import org.junit.rules.*;

import static org.junit.Assert.*;

public class ContainsDuplicatePracticeTest {
    ContainsDuplicatePractice solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new ContainsDuplicatePractice();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int[] nums = {};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int[] nums = {1};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int[] nums = {1, 2};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int[] nums = {1, 1};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int[] nums = {1, 2, 3, 4};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int[] nums = {1, 2, 3, 1};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int[] nums = {1, 2, 1, 3};
        boolean actual = solution.containsDuplicate(nums);
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
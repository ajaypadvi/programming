package interviewbit.level2.maths.adhoc.hammingdistance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class SolutionTest {
    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @After
    public void tearDown() {
        solution = null;
    }

    @Test
    public void test1() {
        int distance = solution.hammingDistance(new ArrayList<>(Arrays.asList(2, 4, 6)));
        assertEquals(8, distance);
    }

    @Test
    public void test2() {
        int distance = solution.hammingDistance(new ArrayList<>(Arrays.asList(2, 7)));
        assertEquals(4, distance);
    }

    @Test
    public void test3() {
        int distance = solution.hammingDistance(new ArrayList<>(Arrays.asList(96, 96, 7, 81, 2, 13)));
        assertEquals(104, distance);
    }

    @Test
    public void testHammingDistance() {
        int distance = solution.hammingDistance("1010001", "111");
        assertEquals(4, distance);
    }

}

package interviewbit.level2.maths.adhoc.hammingdistance1;

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
        int actual = solution.hammingDistance(new ArrayList<Integer>(Arrays.asList(96, 96, 7, 81, 2, 13)));
        assertEquals(104, actual);
    }

    @Test
    public void test2() {
        int actual = solution.hammingDistance(new ArrayList<Integer>(Arrays.asList(4, 14, 2)));
        assertEquals(6, actual);
    }
}

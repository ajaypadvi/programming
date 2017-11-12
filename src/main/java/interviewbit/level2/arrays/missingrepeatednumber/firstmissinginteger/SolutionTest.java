package interviewbit.level2.arrays.missingrepeatednumber.firstmissinginteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void test1() {
        int actual = solution.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 0})));
        assertEquals(actual, 3);
    }

    @Test
    public void test2() {
        int actual = solution.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 4, -1, 1})));
        assertEquals(actual, 2);
    }

    @Test
    public void test3() {
        int actual = solution.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(new Integer[]{-8, -7, -6})));
        assertEquals(actual, 1);
    }
}

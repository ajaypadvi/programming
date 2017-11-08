package interviewbit.chapter01.arrays.arraymath.addone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {
    /**
     * Test method for @Solution}
     */
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
        int[] actual = solution.plusOne(new int[]{9, 9, 9, 9});
        int[] expected = {1, 0, 0, 0, 0};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() {
        int[] actual = solution.plusOne(new int[]{1, 2, 3});
        int[] expected = {1, 2, 4};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3() {
        int[] actual = solution.plusOne(new int[]{0, 1, 2, 3});
        int[] expected = {1, 2, 4};
        assertArrayEquals(actual, expected);
    }
}

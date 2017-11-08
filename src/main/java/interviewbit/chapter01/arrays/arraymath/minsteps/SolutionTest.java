package interviewbit.chapter01.arrays.arraymath.minsteps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        int[] A = {0, 1, 1};
        int[] B = {0, 1, 2};
        int actual = solution.coverPoints(A, B);
        assertEquals(actual, 2);
    }
}

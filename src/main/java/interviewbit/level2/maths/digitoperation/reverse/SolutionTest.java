package interviewbit.level2.maths.digitoperation.reverse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        int actual = solution.reverse(123);
        assertEquals(actual, 321);
    }

    @Test
    public void test2() {
        int actual = solution.reverse(-123);
        assertEquals(actual, -321);
    }
}

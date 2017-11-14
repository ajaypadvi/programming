package interviewbit.level2.maths.verifyprime;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    public void test2() {
        int actual = solution.isPrime(6);
        assertEquals(actual, 0);
    }

    @Test
    public void test1() {
        int actual = solution.isPrime(17);
        assertEquals(actual, 1);
    }

}

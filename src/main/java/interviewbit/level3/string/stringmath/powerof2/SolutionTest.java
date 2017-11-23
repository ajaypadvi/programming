package interviewbit.level3.string.stringmath.powerof2;

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
        int result = solution.power("32");
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = solution.power("8");
        assertEquals(1, result);
    }


    @Test
    public void test3() {
        int result = solution.power("10");
        assertEquals(0, result);
    }
}

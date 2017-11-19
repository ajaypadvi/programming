package interviewbit.level3.string.stringparsing.atoi;

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
        int result = solution.atoi("  -9 2704");
        assertEquals(-92704, result);
    }


    @Test
    public void test2() {
        int result = solution.atoi("  +9 2 7 0 4");
        assertEquals(92704, result);
    }

    @Test
    public void test3() {
        int result = solution.atoi("  9 2 7 0 444%%%%%*%$%^&*");
        assertEquals(9270444, result);
    }

    @Test
    public void test4() {
        int result = solution.atoi("5121478262 8070067M75 X199R 547 8C0A11 93I630 4P4071 029W433619 M3 5 14703818 776366059B9O43393");
        assertEquals(2147483647, result);
    }

    @Test
    public void test5() {
        int result = solution.atoi("  12345678");
        assertEquals(12345678, result);
    }
}

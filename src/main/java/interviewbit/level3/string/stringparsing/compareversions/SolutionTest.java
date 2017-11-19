package interviewbit.level3.string.stringparsing.compareversions;

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
        int actual = solution.compareVersion("1.0", "1.1");
        assertEquals(-1, actual);
    }

    @Test
    public void test2() {
        int actual = solution.compareVersion("1.13.4", "1.13");
        assertEquals(1, actual);
    }

    @Test
    public void test3() {
        int actual = solution.compareVersion("01", "1");
        assertEquals(0, actual);
    }

    @Test
    public void test4() {
        int actual = solution.compareVersion("010", "1");
        assertEquals(1, actual);
    }

    @Test
    public void test5() {
        int actual = solution.compareVersion("4444371174137455", "5.168");
        assertEquals(1, actual);
    }
}

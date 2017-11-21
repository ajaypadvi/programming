package interviewbit.level3.string.stringmath.addbinarystrings;

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
        String actual = solution.addBinary("001", "001");
        assertEquals("010", actual);
    }

    @Test
    public void test2() {
        String actual = solution.addBinary("100", "11");
        assertEquals("111", actual);
    }

    @Test
    public void test3() {
        String actual = solution.addBinary("1010110111001101101000", "1000011011000000111100110");
        assertEquals("1001110001111010101001110", actual);
    }

    @Test
    public void test4() {
        String actual = solution.addBinary("1", "1");
        assertEquals("10", actual);
    }
}

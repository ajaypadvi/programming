package interviewbit.level3.string.stringmath.integertoroman;

import org.junit.After;
import org.junit.Assert;
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
        String actual = solution.intToRoman(3549);
        assertEquals("MMMDXLIX", actual);
    }

    @Test
    public void test2() {
        String actual = solution.intToRoman(1904);
        assertEquals("MCMIV", actual);
    }

    @Test
    public void test3() {
        String actual = solution.intToRoman(45);
        assertEquals("XLV", actual);
    }
}

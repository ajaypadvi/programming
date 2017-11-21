package interviewbit.level3.string.stringmath.romantointeger;

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
        int actual = solution.romanToInt("MCMIV");
        assertEquals(1904, actual);
    }

    @Test
    public void test2() {
        int actual = solution.romanToInt("XX");
        assertEquals(1904, actual);
    }

    @Test
    public void test3() {
        int actual = solution.romanToInt("XIV");
        assertEquals(14, actual);
    }
}

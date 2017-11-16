package interviewbit.level2.maths.binaryrepresentation;

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
        String actual = solution.findDigitsInBinary(8);
        String expected = "1000";
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        String actual = solution.findDigitsInBinary(16);
        String expected = "10000";
        assertEquals(actual, expected);
    }
}

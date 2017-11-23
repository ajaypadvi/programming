package interviewbit.level3.string.prettyprint;

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
        String actual = solution.convert("ABCD", 2);
        assertEquals("ACBD", actual);
    }

    @Test
    public void test2() {
        String actual = solution.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", actual);
    }

    //
}

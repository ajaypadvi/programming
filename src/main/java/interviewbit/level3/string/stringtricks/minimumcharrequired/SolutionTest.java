package interviewbit.level3.string.stringtricks.minimumcharrequired;

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
    public void test1() {
        int result = solution.solve("AACECAAAA");
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        int result = solution.solve("ABC");
        assertEquals(2, result);
    }
}

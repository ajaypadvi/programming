package interviewbit.level2.maths.adhoc.poweroftwointegers;

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
        boolean found = solution.isPower(9);
        assertEquals(found, true);
    }

    @Test
    public void test2() {
        boolean found = solution.isPower(3);
        assertEquals(found, false);
    }

    @Test
    public void test3() {
        boolean found = solution.isPower(81);
        assertEquals(found, true);
    }

    @Test
    public void test4() {
        boolean found = solution.isPower(8);
        assertEquals(found, true);
    }
}

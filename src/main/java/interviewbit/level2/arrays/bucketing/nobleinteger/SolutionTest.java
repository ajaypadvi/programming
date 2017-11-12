package interviewbit.level2.arrays.bucketing.nobleinteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    Solution solution = null;

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
        int actual = solution.solve(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(actual, 1);
    }


    @Test
    public void test2() {
        int actual = solution.solve(new int[]{1, 2, 3, 3, 3, 3, 3, 4, 5, 6});
        assertEquals(actual, 1);
    }


    @Test
    public void test3() {
        int actual = solution.solve(new int[]{0, 0, 0, 0, 0});
        assertEquals(actual, 1);
    }

    @Test
    public void test4() {
        int actual = solution.solve(new int[]{-9, -1, 3, -3, 0});
        assertEquals(actual, -1);
    }

}

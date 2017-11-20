package interviewbit.level3.string.stringparsing.validnumber;

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
        int result = solution.isNumber("0");
        assertEquals(result, 1);
    }

    @Test
    public void test2() {
        int result = solution.isNumber(" 0.1 ");
        assertEquals(result, 1);
    }

    @Test
    public void test3() {
        int result = solution.isNumber("abc");
        assertEquals(result, 0);
    }

    @Test
    public void test4() {
        int result = solution.isNumber("1 a");
        assertEquals(result, 0);
    }

    @Test
    public void test5() {
        int result = solution.isNumber("2e10");
        assertEquals(result, 1);
    }

    @Test
    public void test6() {
        int result = solution.isNumber("0.1e10");
        assertEquals(result, 1);
    }

    @Test
    public void test7() {
        int result = solution.isNumber("-01.1e-10");
        assertEquals(result, 1);
    }

    @Test
    public void test8() {
        int result = solution.isNumber("2e10");
        assertEquals(result, 1);
    }
}

package interviewbit.level3.string.stringsimulation.countandsay;

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
        String result = solution.getCountAndSayRepresentation("1211");
        assertEquals("111221", result);
    }

    @Test
    public void test2() {
        String result = solution.getCountAndSayRepresentation("21");
        assertEquals("1211", result);
    }

    @Test
    public void test3() {
        String result = solution.getCountAndSayRepresentation("11");
        assertEquals("21", result);
    }

    @Test
    public void test4() {
        String result = solution.getCountAndSayRepresentation("111221");
        assertEquals("312211", result);
    }

    @Test
    public void test5() {
        String result = solution.getCountAndSayRepresentation("1");
        assertEquals("11", result);
    }

    @Test
    public void test6() {
        String result = solution.countAndSay(2);
        assertEquals("11", result);
    }

    @Test
    public void test7() {
        String result = solution.countAndSay(4);
        assertEquals("1211", result);
    }
}

package interviewbit.level2.arrays.arrangement.largestnumber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;


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
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        String expected = "9534330";
        String actual = solution.largestNumber(list);
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9, 0, 0, 0));
        String expected = "9534330000";
        String actual = solution.largestNumber(list);
        assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 0, 0));
        String expected = "0";
        String actual = solution.largestNumber(list);
        assertEquals(expected, actual);
    }
}

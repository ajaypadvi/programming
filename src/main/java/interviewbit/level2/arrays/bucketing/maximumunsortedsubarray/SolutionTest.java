package interviewbit.level2.arrays.bucketing.maximumunsortedsubarray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60));
        ArrayList<Integer> actual = solution.subUnsort(input);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(8);
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 13, 15, 16, 17, 13, 13, 15, 17, 17, 17, 17, 17, 19, 19));
        ArrayList<Integer> actual = solution.subUnsort(input);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(11);
        assertEquals(actual, expected);
    }
}

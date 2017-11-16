package interviewbit.level2.arrays.simulation.maxnonnegativesubarray;

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
        ArrayList<Integer> actual = solution.maxSet(new ArrayList<>(Arrays.asList(1, 2, 5, -7, 2, 3)));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        ArrayList<Integer> actual = solution.maxSet(new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368)));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1967513926, 1540383426));
        assertEquals(expected, actual);
    }
}

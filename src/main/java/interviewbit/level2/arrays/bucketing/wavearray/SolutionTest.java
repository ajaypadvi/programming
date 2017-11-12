package interviewbit.level2.arrays.bucketing.wavearray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        ArrayList<Integer> actual = solution.wave(new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4})));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 1, 4, 3));
        assertEquals(actual, expected);
    }
}

package interviewbit.level2.maths.primenumbers;

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
        ArrayList<Integer> actualPrimes = solution.sieve(15);
        ArrayList<Integer> expectedPrimes = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13));
        assertEquals(actualPrimes, expectedPrimes);
    }
}

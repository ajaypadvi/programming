package interviewbit.level2.maths.allfactors;

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
        ArrayList<Integer> actual = solution.allFactors1(6);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 6));
        assertEquals(actual, expected);

        actual=solution.allFactors2(6);
        assertEquals(actual, expected);

        actual=solution.allFactors3(6);
        assertEquals(actual, expected);
    }
}

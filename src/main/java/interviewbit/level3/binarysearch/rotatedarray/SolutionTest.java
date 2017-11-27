package interviewbit.level3.binarysearch.rotatedarray;

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
    public void after() {
        solution = null;
    }

    @Test
    public void test1() {
        int result = solution.findNumberOfRotations(new ArrayList<Integer>(Arrays.asList(11, 12, 15, 18, 2, 5, 6, 8)));
        assertEquals(4, result);
    }
}

package interviewbit.level2.maths.mathsbug2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
        ArrayList<ArrayList<Integer>> actual = solution.squareSum(8);
        System.out.println("actual" + actual);
    }
}

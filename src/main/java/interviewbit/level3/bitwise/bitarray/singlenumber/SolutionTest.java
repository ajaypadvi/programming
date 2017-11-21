package interviewbit.level3.bitwise.bitarray.singlenumber;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @After
    public void after() {
        solution = null;
    }

    @Test
    public void test1() {
        int actual = solution.singleNumber(Arrays.asList(1, 2, 2, 3, 1));
        assertEquals(3, actual);
    }
}

package interviewbit.level2.arrays.bucketing.duplicateinarray;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutonTest {

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
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 4, 1, 4, 1}));
        int actual = solution.repeatedNumber(list);
        assertEquals(actual, 4);

    }
}

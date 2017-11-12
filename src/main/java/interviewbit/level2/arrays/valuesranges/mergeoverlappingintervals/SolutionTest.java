package interviewbit.level2.arrays.valuesranges.mergeoverlappingintervals;

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
    public void test1() {//[1,3],[2,6],[8,10],[15,18]
        Solution.Interval[] actualArray = new Solution.Interval[]{new Solution.Interval(1, 3),
                new Solution.Interval(2, 6),
                new Solution.Interval(8, 10),
                new Solution.Interval(15, 18)};
        ArrayList<Solution.Interval> intervals = new ArrayList<Solution.Interval>(Arrays.asList(actualArray));
        ArrayList<Solution.Interval> actual = solution.merge(intervals);
        ArrayList<Solution.Interval> expected = new ArrayList<>(Arrays.asList(new Solution.Interval[]{new Solution.Interval(1, 6), new Solution.Interval(8, 10), new Solution.Interval(15, 18)}));
        assertEquals(actual, expected);
    }
}


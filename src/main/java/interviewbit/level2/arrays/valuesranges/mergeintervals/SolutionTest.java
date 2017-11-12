package interviewbit.level2.arrays.valuesranges.mergeintervals;

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
        Solution.Interval[] actualArray = new Solution.Interval[]{new Solution.Interval(1, 3), new Solution.Interval(6, 9)};
        ArrayList<Solution.Interval> intervals = new ArrayList<Solution.Interval>(Arrays.asList(actualArray));
        Solution.Interval toBeMerged = new Solution.Interval(2, 5);
        ArrayList<Solution.Interval> actual = solution.insert(intervals, toBeMerged);
        ArrayList<Solution.Interval> expected = new ArrayList<>(Arrays.asList(new Solution.Interval[]{new Solution.Interval(1, 5), new Solution.Interval(6, 9)}));
        assertEquals(actual, expected);


    }

    @Test
    public void test2() {//[1,2],[3,5],[6,7],[8,10],[12,16]
        Solution.Interval[] actualArray = new Solution.Interval[]{new Solution.Interval(1, 2),
                new Solution.Interval(3, 5),
                new Solution.Interval(6, 7),
                new Solution.Interval(8, 10),
                new Solution.Interval(12, 16)};
        ArrayList<Solution.Interval> intervals = new ArrayList<Solution.Interval>(Arrays.asList(actualArray));
        Solution.Interval toBeMerged = new Solution.Interval(4, 9);
        ArrayList<Solution.Interval> actual = solution.insert(intervals, toBeMerged);
        ArrayList<Solution.Interval> expected = new ArrayList<>(Arrays.asList(new Solution.Interval[]{new Solution.Interval(1, 2),
                new Solution.Interval(3, 10),
                new Solution.Interval(12, 16)}));
        assertEquals(actual, expected);
    }
}

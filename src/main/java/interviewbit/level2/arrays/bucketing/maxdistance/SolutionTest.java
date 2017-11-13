package interviewbit.level2.arrays.bucketing.maxdistance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Input: { 3, 5, 4, 2}
 * Output: 2 (j=2,i=0)
 * Output: 6  (j = 7, i = 1)
 * Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
 * Output: 6  (j = 7, i = 1)
 * <p>
 * Input: {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}
 * Output: 8 ( j = 8, i = 0)
 * <p>
 * Input:  {1, 2, 3, 4, 5, 6}
 * Output: 5  (j = 5, i = 0)
 * <p>
 * Input:  {6, 5, 4, 3, 2, 1}
 * Output: -1
 */
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
        //Using first approach
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 4, 2));
        int actual = solution.maximumGap1(list);
        assertEquals(actual, 2);

        //Using second approach
        actual = solution.maximumGap2(list);
        assertEquals(actual, 2);
    }

    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34, 8, 10, 3, 2, 80, 30, 33, 1));
        int actual = solution.maximumGap1(list);
        assertEquals(actual, 6);

        //Using second approach
        actual = solution.maximumGap2(list);
        assertEquals(actual, 6);
    }

    @Test
    public void test3() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(9, 2, 3, 4, 5, 6, 7, 8, 18, 0));
        int actual = solution.maximumGap1(list);
        assertEquals(actual, 8);

        //Using second approach
        actual = solution.maximumGap2(list);
        assertEquals(actual, 8);
    }

    @Test
    public void test4() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int actual = solution.maximumGap1(list);
        assertEquals(actual, 5);

        //Using second approach
        actual = solution.maximumGap2(list);
        assertEquals(actual, 5);
    }

    @Test
    public void test5() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));
        int actual = solution.maximumGap1(list);
        assertEquals(actual, -1);

        //Using second approach
        actual = solution.maximumGap2(list);
        assertEquals(actual, -1);
    }

    @Test
    public void test6() {
        //100, 100, 100, 100, 100
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100));
        //Using second approach
        int actual = solution.maximumGap2(list);
        assertEquals(actual, 4);
    }
}

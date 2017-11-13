package interviewbit.level2.arrays.bucketing.hotelbookingspossible;

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
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 6, 8));
        boolean rooms_available = solution.hotel(list1, list2, 1);
        assertEquals(rooms_available, false);
    }

    @Test
    public void test2() {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10, 2, 6, 14));
        boolean rooms_available = solution.hotel(list1, list2, 4);
        assertEquals(rooms_available, false);
    }
}

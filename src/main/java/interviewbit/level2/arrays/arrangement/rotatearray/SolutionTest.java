package interviewbit.level2.arrays.arrangement.rotatearray;

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
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(3, 4));

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(row1);
        input.add(row2);

        solution.rotate(input);

        row1 = new ArrayList<>(Arrays.asList(3, 1));
        row2 = new ArrayList<>(Arrays.asList(4, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(row1);
        expected.add(row2);

        assertEquals(input, expected);
    }


    @Test
    public void test2() {
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4, 5, 6));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(7, 8, 9));

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(row1);
        input.add(row2);
        input.add(row3);

        solution.rotate(input);

        row1 = new ArrayList<>(Arrays.asList(7, 4, 1));
        row2 = new ArrayList<>(Arrays.asList(8, 5, 2));
        row3 = new ArrayList<>(Arrays.asList(9, 6, 3));

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(row1);
        expected.add(row2);
        expected.add(row3);

        assertEquals(input, expected);
    }
}

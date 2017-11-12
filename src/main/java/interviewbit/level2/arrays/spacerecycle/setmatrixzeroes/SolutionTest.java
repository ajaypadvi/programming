package interviewbit.level2.arrays.spacerecycle.setmatrixzeroes;

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
    public void test1() {
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 0, 1));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(1, 1, 1));
        ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(1, 1, 1));
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(row1);
        matrix.add(row2);
        matrix.add(row3);
        solution.setZeroes(matrix);
        assertTrue(true);
    }

}

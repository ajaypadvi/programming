package interviewbit.level2.arrays.simulation.spiralmatrix2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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
        int[][] actual = solution.generateMatrix(3);
        int[][] expected = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() {
        int[][] actual = solution.generateMatrix(4);
        int[][] expected = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        assertArrayEquals(actual, expected);
    }
}

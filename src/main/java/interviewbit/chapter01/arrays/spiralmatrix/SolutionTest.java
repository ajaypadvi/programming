package interviewbit.chapter01.arrays.spiralmatrix;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    /**
     * Test method for @{@link Solution}
     */
    Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void test1() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] actual = solution.spiralOrder(A);
        int[] expected = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test2() {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int[] actual = solution.spiralOrder(A);
        int[] expected = {1, 2, 3, 4, 8, 7, 6, 5};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test3() {
        int[][] A = {{1, 2, 3}};
        int[] actual = solution.spiralOrder(A);
        int[] expected = {1, 2, 3};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void test4() {
        int[][] A = {{1, 2}, {3, 4}, {5, 6}};
        int[] actual = solution.spiralOrder(A);
        int[] expected = {1, 2, 4, 6, 5, 3};
        assertArrayEquals(actual, expected);
    }
}

package interviewbit.chapter01.arrays.arraymath.arraybug;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    /**
     * Test method for @{@link Solution}
     */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 1;
        ArrayList<Integer> actual = solution.rotateArray(A, B);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(1);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 55;
        ArrayList<Integer> actual = solution.rotateArray(A, B);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(1);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 0;
        ArrayList<Integer> actual = solution.rotateArray(A, B);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 5;
        ArrayList<Integer> actual = solution.rotateArray(A, B);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        int B = 17;
        ArrayList<Integer> actual = solution.rotateArray(A, B);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, actual);
    }
}

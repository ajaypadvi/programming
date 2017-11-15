package interviewbit.level2.maths.digitoperation.palindromeinteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        boolean isPalindrome = solution.isPalindrome(12121);
        assertEquals(isPalindrome, true);
    }

    @Test
    public void test2() {
        boolean isPalindrome = solution.isPalindrome(1);
        assertEquals(isPalindrome, true);
    }

    @Test
    public void test3() {
        boolean isPalindrome = solution.isPalindrome(123);
        assertEquals(isPalindrome, false);
    }
}

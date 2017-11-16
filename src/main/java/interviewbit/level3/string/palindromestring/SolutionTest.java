package interviewbit.level3.string.palindromestring;

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
        int isPalindrome = solution.isPalindrome("A man, a plan, a canal: Panama");
        assertEquals(1, isPalindrome);
    }

    @Test
    public void test2() {
        int isPalindrome = solution.isPalindrome("race a car");
        assertEquals(0, isPalindrome);
    }
}

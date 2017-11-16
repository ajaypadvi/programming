package interviewbit.level3.string.longestcommonprefix;

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
        String prefix = solution.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "aefghijk", "abcefgh")));
        assertEquals("a", prefix);
    }

    @Test
    public void test2() {
        String prefix = solution.longestCommonPrefix(new ArrayList<>(Arrays.asList("abcdefgh", "abcefgh", "abc")));
        assertEquals("abc", prefix);
    }
}

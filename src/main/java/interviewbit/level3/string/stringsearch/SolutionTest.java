package interviewbit.level3.string.stringsearch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        int result = solution.strStr("abcdefdec", "dec");
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        int result = solution.strStr("abcglnabcglp", "abcglp");
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        int result = solution.strStr("bbaabbbbbaabbaabbbbbbabbbabaabbbabbabbbbababbbabbabaaababbbaabaaaba", "babaaa");
        assertEquals(6, result);
    }

}

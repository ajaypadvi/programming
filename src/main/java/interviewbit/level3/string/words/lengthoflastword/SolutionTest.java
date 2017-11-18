package interviewbit.level3.string.words.lengthoflastword;

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
        int actual = solution.lengthOfLastWord("Hello World");
        assertEquals(5, actual);
    }

    @Test
    public void test2() {
        int actual = solution.lengthOfLastWord("World");
        assertEquals(5, actual);
    }

    @Test
    public void test3() {
        int actual = solution.lengthOfLastWord("Ajay Yeshwant Padvi");
        assertEquals(5, actual);
    }

    @Test
    public void test4() {
        int actual = solution.lengthOfLastWord("Hello World ");
        assertEquals(5, actual);
    }

    @Test
    public void test5() {
        int actual = solution.lengthOfLastWord("    ");
        assertEquals(0, actual);
    }
}

package interviewbit.level3.string.stringparsing.validipaddresses;

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
        ArrayList<String> result = solution.restoreIpAddresses("25525511135");
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("255.255.11.135", "255.255.111.35"));
        assertEquals(expected, result);
    }
}

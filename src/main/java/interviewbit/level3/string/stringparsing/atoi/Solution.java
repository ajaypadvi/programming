package interviewbit.level3.string.stringparsing.atoi;

/*
Please Note:
There are certain questions where the interviewer would intentionally frame the question vague.
The expectation is that you will ask the correct set of clarifications or state your assumptions before you jump into coding.

Implement atoi to convert a string to an integer.

Example :

Input : "9 2704"
Output : 9
Note: There might be multiple corner cases here. Clarify all your doubts using “See Expected Output”.

 Questions: Q1. Does string contain whitespace characters before the number?
A. Yes Q2. Can the string have garbage characters after the number?
A. Yes. Ignore it. Q3. If no numeric character is found before encountering garbage characters, what should I do?
A. Return 0. Q4. What if the integer overflows?
A. Return INT_MAX if the number is positive, INT_MIN otherwise.
Warning : DO NOT USE LIBRARY FUNCTION FOR ATOI.
If you do, we will disqualify your submission retroactively and give you penalty points.
 */
public class Solution {
    /**
     * 1.Remove any leading white spaces
     * 2.Check if any sign is present, remove that one by keeping a record of it
     *
     * @param a
     * @return
     */
    public int atoi(final String a) {
        long result = 0;//kept long so that it is capable of holding value when overflow occurs,note that overflows are handled separately in condition inside code
        if (a == null || a.length() == 0) {
            return (int) result;
        }
        //1.Remove any leading white spaces
        int index = 0;
        while (index < a.length() && a.charAt(index) == ' ') {
            index++;
        }
        //2.Check if any sign is present, remove that one by keeping a record of it
        boolean isNegative = false;
        if (a.charAt(index) == '+' || a.charAt(index) == '-') {
            isNegative = a.charAt(index) == '-' ? true : false;
            index++;
        }
        //3.Remove any leading white spaces
        while (index < a.length() && a.charAt(index) == '0') {
            index++;
        }

        while (index < a.length()) {
            char ch = a.charAt(index);

            if (!checkValidCharacter(ch)) {
                break;
            }
            result = result * 10 + (ch - '0');
            //If result overflows then as per the description in problem
            //Q4. What if the integer overflows?
            //A. Return INT_MAX if the number is positive, INT_MIN otherwise.
            if (result >= Integer.MAX_VALUE) {
                result = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                return (int) result;
            }
            index++;
        }
        if (isNegative)
            result = -result;
        return (int) result;
    }

    private static boolean checkValidCharacter(char ch) {
        if (ch >= '0' & ch <= '9') {
            return true;
        }
        return false;
    }
}

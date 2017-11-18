package interviewbit.level3.string.words.lengthoflastword;

import java.util.ArrayList;

/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Given s = "Hello World",

return 5 as length("World") = 5.

Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.


 */
public class Solution {
    public int lengthOfLastWord(final String a) {
        boolean char_flag = false;
        int len = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            if (Character.isLetter(a.charAt(i))) {
                // Once the first chracter from last
                // is encountered, set char_flag to true.
                char_flag = true;
                len++;
            } else {
                // When the first space after the characters
                // (from the last) is encountered, return the
                // length of the last word
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
}

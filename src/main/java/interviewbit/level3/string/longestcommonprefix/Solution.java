package interviewbit.level3.string.longestcommonprefix;

import java.util.ArrayList;

/*
Write a function to find the longest common prefix string amongst an array of strings.
Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
As an example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".
Given the array of strings, you need to find the longest S which is the prefix of ALL the strings in the array.
Example:
Given the array as:
[

  "abcdefgh",

  "aefghijk",

  "abcefgh"
]
The answer would be “a”.
 */
public class Solution {
    public String longestCommonPrefix(ArrayList<String> a) {
        StringBuilder prefix = new StringBuilder();
        int i = 0, n = a.size();
        while (true) {
            try {
                int j;
                char currentChar = a.get(0).charAt(i);
                for (j = 1; j < n; j++) {
                    if (currentChar != a.get(j).charAt(i)) {
                        break;
                    }
                }
                if (j == n) {
                    prefix.append(currentChar);
                }
            } catch (RuntimeException ex) {
                break;
            }
            i++;
        }
        return prefix.toString();
    }
}

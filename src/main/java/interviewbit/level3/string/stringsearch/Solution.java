package interviewbit.level3.string.stringsearch;

/*
Another question which belongs to the category of questions which are intentionally stated vaguely.
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Implement strStr().
 strstr - locate a substring ( needle ) in a string ( haystack ).
Try not to use standard library string functions for this question.
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 NOTE: Good clarification questions:
What should be the return value if the needle is empty?
What if both haystack and needle are empty?
For the purpose of this problem, assume that the return value should be -1 in both cases.
 */


public class Solution {

    /*
    Using brute force algorithm
    time complexity is O(MN)
     */
    public int strStr(final String haystack, final String needle) {
        if (haystack.isEmpty() || needle.isEmpty())
            return -1;
        if (haystack == null || needle == null)
            return -1;
        int M = needle.length();
        int N = haystack.length();
        int i = 0, j = 0;
        while (i < N && j < N) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                i = i - j;
                j = 0;
            }
            i++;
        }

        if (j == M)
            return i - M;
        else
            return -1;
    }
}

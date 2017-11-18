package interviewbit.level3.string.stringtricks.minimumcharrequired;

/*
Minimum Characters required to make a String PalindromicBookmark Suggest Edit
You are given a string. The only operation allowed is to insert characters in the beginning of the string. How many minimum characters are needed to be inserted to make the string a palindrome string

Example:
Input: ABC
Output: 2
Input: AACECAAAA
Output: 2
 */
public class Solution {
    /*
    Minimum characters to be added at front to make string palindrome
4
Given a string str we need to tell minimum characters to be added at front of string to make string palindrome.

Examples:

Input  : str = "ABC"
Output : 2
We can make above string palindrome as "CBABC"
by adding 'B' and 'C' at front.

Input  : str = "AACECAAAA";
Output : 2
We can make above string palindrome as AAAACECAAAA
by adding two A's at front of string.
Recommended: Please try your approach on {IDE} first, before moving on to the solution.
A brute force way to solve this problem is to keep adding characters from last one by one at front and keep checking whether current string is palindrome or not, at max we need to check characters equal to half of length of string because in worst case half of the string need to be added at front to make string palindrome.

We can solve this problem efficiently in O(n) time using lps array of KMP algorithm.
First we concat string by concatenating given string, a special character and reverse of given string then we will get lps array for this concatenated string, recall that each index of lps array represent longest proper prefix which is also suffix. We can use this lps array for solving the problem.

For string = AACECAAAA
Concatenated String = AACECAAAA$AAAACECAA
LPS array will be {0, 1, 0, 0, 0, 1, 2, 2, 2,
                   0, 1, 2, 2, 2, 3, 4, 5, 6, 7}
Here we are only interested in the last value of this lps array because it shows us the largest suffix of the reversed string that matches the prefix of the original string i.e these many characters already satisfy the palindrome property. Finally minimum number of character needed to make the string a palindrome is length of the input string minus last entry of our lps array. Pease see below code for better understanding
     */
    public int solve(String A) {
        int result = 0;
        if (A == null || A.length() == 0) {
            return result;
        }
        StringBuilder reversed = new StringBuilder(A).reverse();

        StringBuilder finalString = new StringBuilder(A);
        finalString.append("$");
        finalString.append(reversed);


        int n = finalString.length();
        int i = 0, j = 1;
        int LPS[] = new int[n];
        LPS[0] = 0;
        while (j < n) {
            if (finalString.charAt(i) == finalString.charAt(j)) {
                LPS[j] = i + 1;
                j++;
                i++;
            } else {
                if (i > 0) {
                    i--;
                } else {
                    j++;
                }
                continue;
            }
        }

        int count = LPS[n - 1];
        result = A.length() - count;
        return result;
    }
}
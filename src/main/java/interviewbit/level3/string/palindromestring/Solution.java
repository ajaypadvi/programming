package interviewbit.level3.string.palindromestring;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
Example:
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class Solution {
    public int isPalindrome(String a) {
        int isPalindrome = 1;
        int n = a.length();
        int i = 0, j = n - 1;
        while (i <= n / 2 && j >= n / 2) {
            if (!Character.isLetterOrDigit(a.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(a.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(a.charAt(i)) != Character.toLowerCase(a.charAt(j))) {
                isPalindrome = 0;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;
    }
}

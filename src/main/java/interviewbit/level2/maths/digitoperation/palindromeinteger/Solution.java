package interviewbit.level2.maths.digitoperation.palindromeinteger;

/*
Determine whether an integer is a palindrome. Do this without extra space.
A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.
Example :
Input : 12121
Output : True

Input : 123
Output : False
 */
public class Solution {

    public boolean isPalindrome(int a) {
        String number = Integer.toString(a);
        if (number.length() < 2) {
            return true;
        }
        boolean isPalindrome = true;
        for (int k = 0; k < number.length() / 2; k++) {
            if (number.charAt(k) == number.charAt((number.length() - 1) - k)) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}

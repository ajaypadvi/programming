package interviewbit.level2.maths.verifyprime;

/*
Given a number N, verify if N is prime or not.

Return 1 if N is prime, else return 0.

Example :

Input : 7
Output : True

A prime number is a whole number greater than 1, whose only two whole-number factors are 1 and itself. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, and 29
 */
public class Solution {
    public int isPrime(int a) {
        boolean isPrime = true;
        if (a <= 1) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime ? 1 : 0;
    }
}

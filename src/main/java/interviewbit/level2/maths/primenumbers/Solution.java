package interviewbit.level2.maths.primenumbers;

import java.util.ArrayList;

/**
 * Given a number N, find all prime numbers upto N ( N included ).
 * <p>
 * Example:
 * <p>
 * if N = 7,
 * <p>
 * all primes till 7 = {2, 3, 5, 7}
 * <p>
 * Make sure the returned array is sorted.
 * <p>
 * Finding prime numbers using sieve of eratosthenes
 * If the number is the prime number then all numbers which are multiple of it cannot be prime number
 */
public class Solution {
    public ArrayList<Integer> sieve(int a) {
        ArrayList<Integer> primes = new ArrayList<>();

        int[] temp = new int[a + 1];
        //Mark all numbers as prime number from above helper array
        for (int i = 2; i < temp.length; i++) {//We start with 2 as 0 and 1 are not the prime numbers
            temp[i] = 1;
        }

        //We only loop till sqrt(a) as all th enumbers multiple of prims would be striked off till we reached to square root
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (isPrime(i) == 1) {
                for (int j = i; i * j <= a; j++) {
                    temp[i * j] = 0;//As multiples of prime numbers cannot be prime number hence we strike off
                }
            }
        }

        //Add all primes from temp helper array to primes list which is the output
        for (int i = 2; i < temp.length; i++) {
            if (temp[i] == 1)
                primes.add(i);
        }

        return primes;
    }

    public static int isPrime(int a) {
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

package interviewbit.level2.maths.adhoc.primesum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * <p>
 * NOTE A solution will always exist. read Goldbach’s conjecture
 * <p>
 * Example:
 * <p>
 * <p>
 * Input : 4
 * Output: 2 + 2 = 4
 * <p>
 * If there are more than one solutions possible, return the lexicographically smaller solution.
 * <p>
 * If [a, b] is one solution with a <= b,
 * and [c,d] is another solution with c <= d, then
 * <p>
 * [a, b] < [c, d]
 * <p>
 * If a < c OR a==c AND b < d.
 */
public class Solution {

    public ArrayList<Integer> primesum(int a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        //Calculate all prime numbers between 2 and a-1 using sieve of eratosthenes
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
        /**
         * Logical reasoning for doing below is
         * (0+16)=16
         * 1+15=16
         * 2+14=16
         * 3+13=16
         * 4+12=16
         * 5+11=16
         * 6+10=16
         * 7+9=16
         * 8+8=16
         *.
         *.
         *.
         *.
         *  and so on till 16+0=16
         */
        for (int i = 2; i <= a; i++) {
            if (temp[i] == 1 && temp[a - i] == 1) {
                ArrayList<Integer> response = new ArrayList<Integer>();
                response.add(i);
                response.add(a - i);
                result.add(response);
            }
        }

        //In case if there are multiple solutions ie multiple pairs inside bucket then sort list of pairs as per criteria mentioned
        Collections.sort(result, new Comparator<ArrayList<Integer>>() {

            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                ArrayList<Integer> list1 = o1;
                ArrayList<Integer> list2 = o2;
                if ((list1.get(0) < list2.get(0)) || (list1.get(0) == list2.get(0)) && list1.get(1) < list2.get(2)) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        return result.size() > 0 ? result.get(0) : new ArrayList<Integer>();
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

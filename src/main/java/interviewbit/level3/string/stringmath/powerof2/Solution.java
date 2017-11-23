package interviewbit.level3.string.stringmath.powerof2;

import java.math.BigInteger;

/**
 * Find if Given number is power of 2 or not.
 * More specifically, find if given number can be expressed as 2^k where k >= 1.
 * <p>
 * Input:
 * <p>
 * number length can be more than 64, which mean number can be greater than 2 ^ 64 (out of long long range)
 * Output:
 * <p>
 * return 1 if the number is a power of 2 else return 0
 * <p>
 * Example:
 * <p>
 * Input : 128
 * Output : 1
 */
public class Solution {
    /**
     * All power of two numbers have only one bit set. So count the no. of set bits and if you get 1 then number is a power of 2.
     * Please see http://www.geeksforgeeks.org/?p=1176 for counting set bits.
     *
     * @param a
     * @return
     */
    public int power1(String a) {
        java.math.BigInteger bigInteger = new java.math.BigInteger(a);
        if (bigInteger.compareTo(java.math.BigInteger.ONE) == 0 || bigInteger.compareTo(java.math.BigInteger.ZERO) == 0)
            return 0;
        for (int i = 0; i < bigInteger.bitLength() - 1; i++) {
            if (bigInteger.testBit(i)) return 0;
        }
        return bigInteger.testBit(bigInteger.bitLength() - 1) ? 1 : 0;
    }

    /**
     * Solution is to keep dividing the number by two, i.e, do n = n/2 iteratively. In any iteration, if n%2 becomes non-zero and n is not 1 then n is not a power of 2. If n becomes 1 then it is a power of 2.
     * This will not work for any string which is to be represented as a 64 bit integer/long
     *
     * @param a
     * @return
     */
    public int power(String a) {
        int result = 0;
        if (a == null) {
            return result;
        }
        int number = Integer.parseInt(a);
        if (number == 0 || number == 1) {
            return result;
        }

        while (number != 1) {
            if (number % 2 != 0)
                return result;
            number /= 2;
        }
        if (number == 1) {
            result = 1;
        }
        return result;
    }

}

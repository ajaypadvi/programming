package interviewbit.level2.maths.adhoc.poweroftwointegers;

/*
Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True
as 2^2 = 4.


 */
public class Solution {
    /**
     * The idea is simple try all numbers x starting from 2 to square root of n (given number).
     * <p>
     * The reason for why we only look for the numbers which are either less or equals to sqrt of i is that any number greater than sqrt of i will always yield power greater than a.
     * So there is no point in checking numbers greater than sqrt of i
     * Then,For every x, try x^y where y starts from 2 and increases one by one until either x^y becomes n or greater than n.
     *
     * @param a
     * @return
     */
    public boolean isPower(int a) {
        boolean found = false;
        if (a <= 0)
            return found;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            double power;
            for (int j = 2; (power = Math.pow(i, j)) <= a; j++) {
                if (power == a) {
                    System.out.println(a + " can be represented as " + i + " power of " + j);
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}

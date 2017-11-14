package interviewbit.level2.maths.allfactors;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Given a number N, find all factors of N.
 * <p>
 * Example:
 * <p>
 * N = 6
 * factors = {1, 2, 3, 6}
 * Make sure the returned array is sorted.
 */
public class Solution {
    /**
     * Using trial division method
     * Time complexity is O(n)
     *
     * @param a
     * @return
     */
    public ArrayList<Integer> allFactors1(int a) {
        TreeSet<Integer> factors = new TreeSet<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                factors.add(i);
        }
        return new ArrayList<>(factors);
    }

    /**
     * Somewhat efficient than trial division method but still performs poorly for large numbers
     * The idea is minim factor for anu number is 1 and the maximum factor for any number is number itself
     * So we exclude 1 and number from calculating factors
     * leaving those above now the minimum factor could be from n to n/2 if we consider the example of factor of number n {1,2,3,4,6,9,12,18,36}
     * So we find the factors from 2 to n/2 instead of 1 to n
     * <p>
     * Time complexity is O(n)
     *
     * @param a
     * @return
     */
    public ArrayList<Integer> allFactors2(int a) {
        TreeSet<Integer> factors = new TreeSet<>();
        factors.add(1);
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0)
                factors.add(i);
        }
        factors.add(a);
        return new ArrayList<>(factors);
    }

    /**
     * This method uses concept of co factors
     * if a is the factor of n then there exists another number b such that b=n/2 and a*b=n
     * we calculate factors along with co factors from 2 to sqrt(n) as after sqrt(2), each factor is nothing but cofactor of the previously calculated factor
     * <p>
     * <p>
     * Time complexity is O(sqrt(n))
     *
     * @param a
     * @return
     */
    public ArrayList<Integer> allFactors3(int a) {
        TreeSet<Integer> factors = new TreeSet<>();
        factors.add(1);
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                //Calculate factor and add to factors list
                factors.add(i);
                //also calculate co factor and add it to list
                if (i != Math.sqrt(a)) {
                    factors.add(a / i);
                }
            }
        }
        factors.add(a);
        return new ArrayList<>(factors);
    }
}

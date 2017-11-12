package interviewbit.level2.arrays.spacerecycle.setmatrixzeroes;

import java.util.ArrayList;

/**
 * Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
 * <p>
 * Do it in place.
 * <p>
 * Example
 * <p>
 * Given array A as
 * <p>
 * 1 0 1
 * 1 1 1
 * 1 1 1
 * On returning, the array A should be :
 * <p>
 * 0 0 0
 * 1 0 1
 * 1 0 1
 * Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.
 */
public class Solution {
    /**
     * Strategy employed in below solutions is to keep track of rows to be givens zeroes values and columns to be gived zero values in two
     * separate variables/spaces such as rowsZeroes and columnZeroes
     * <p>
     * The reason for this is we cant changes matrix values while we are iterating over the collection as it
     * will give false impression for some of the ements whcih are changes in the process to zero rather than they actually being zero when we started off.
     *
     * @param a
     */
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        if (a == null || a.size() == 0) {
            return;
        }
        ArrayList<Boolean> rowZeroes = new ArrayList<Boolean>(a.size());
        ArrayList<Boolean> colmnZeroes = new ArrayList<Boolean>(a.get(0).size());

        for (int i = 0; i < a.size(); i++) {
            rowZeroes.add(i, false);
        }

        for (int j = 0; j < a.get(0).size(); j++) {
            colmnZeroes.add(j, false);
        }

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(i).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    rowZeroes.set(i, true);
                    colmnZeroes.set(j, true);
                }
            }
        }
        //System.out.println(rowZeroes);
        //System.out.println(colmnZeroes);

        for (int i = 0; i < rowZeroes.size(); i++) {
            if (rowZeroes.get(i) == Boolean.TRUE) {
                for (int j = 0; j < a.get(0).size(); j++) {
                    a.get(i).set(j, 0);
                }
            }
        }

        for (int j = 0; j < colmnZeroes.size(); j++) {
            if (colmnZeroes.get(j) == Boolean.TRUE) {
                for (int i = 0; i < a.size(); i++) {
                    a.get(i).set(j, 0);
                }
            }
        }

        //System.out.println(a);

    }
}

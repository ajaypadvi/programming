package interviewbit.level2.arrays.bucketing.nobleinteger;

import java.util.Arrays;

/**
 * Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
 * If such an integer is found return 1 else return -1.
 */
public class Solution {

    public int solve(int[] A) {
        int found = -1;
        if (A == null || A.length == 0) {
            return found;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1])
                continue;
            if (A[i] == A.length - i - 1) {
                found = 1;
                break;
            }
        }
        if (A[A.length - 1] == 0) {
            found = 1;
        }
        return found;
    }
}

package interviewbit.chapter01.arrays.arraymath.maxsum;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example:
 * <p>
 * Given the array [-2,1,-3,4,-1,2,1,-5,4],
 * <p>
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * <p>
 * For this problem, return the maximum sum.
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    /**
     * The changing condition for dynamic programming is "We should ignore the sum of the previous n-1 elements if nth element is greater than the sum."
     *
     * @param A
     * @return
     */
    public int maxSubArray(final int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int newSum = A[0], max = A[0];
        for (int i = 1; i < A.length; i++) {
            newSum = Math.max(newSum + A[i], A[i]);
            max = Math.max(newSum, max);
        }
        return max;
    }
}

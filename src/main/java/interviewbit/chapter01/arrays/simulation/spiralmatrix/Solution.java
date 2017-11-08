package interviewbit.chapter01.arrays.simulation.spiralmatrix;

/**
 * Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * <p>
 * Example:
 * <p>
 * Given the following matrix:
 * <p>
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * You should return
 * <p>
 * [1, 2, 3, 6, 9, 8, 7, 4, 5]
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        if (A == null || A[0].length == 0) {
            return new int[0];
        }
        int[] result = new int[A.length * A[0].length];
        int top = 0, bottom = A.length - 1, left = 0, right = A[0].length - 1;
        int dir = 0, j = 0;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++, j++) {
                    result[j] = A[top][i];
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++, j++) {
                    result[j] = A[i][right];
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--, j++) {
                    result[j] = A[bottom][i];
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--, j++) {
                    result[j] = A[i][left];
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }

        return result;
    }
}

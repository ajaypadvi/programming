package interviewbit.level2.arrays.simulation.spiralmatrix2;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * <p>
 * Example:
 * <p>
 * Given n = 3,
 * <p>
 * You should return the following matrix:
 * <p>
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 */
public class Solution {
    public int[][] generateMatrix(int A) {
        if (A <= 0) {
            return new int[0][0];
        }
        int[][] result = new int[A][A];
        int top = 0, bottom = A - 1, left = 0, right = A - 1;
        int dir = 0, j = 1;
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++, j++) {
                    result[top][i] = j;
                }
                top++;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++, j++) {
                    result[i][right] = j;
                }
                right--;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--, j++) {
                    result[bottom][i] = j;
                }
                bottom--;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--, j++) {
                    result[i][left] = j;
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}

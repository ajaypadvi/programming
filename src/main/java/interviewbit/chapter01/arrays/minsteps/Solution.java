package interviewbit.chapter01.arrays.minsteps;

/**
 * Min Steps in Infinite GridBookmark Suggest Edit
 * You are in an infinite 2D grid where you can move in any of the 8 directions :
 * <p>
 * (x,y) to
 * (x+1, y),
 * (x - 1, y),
 * (x, y+1),
 * (x, y-1),
 * (x-1, y-1),
 * (x+1,y+1),
 * (x-1,y+1),
 * (x+1,y-1)
 * You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.
 * <p>
 * Example :
 * <p>
 * Input : [(0, 0), (1, 1), (1, 2)]
 * Output : 2
 * It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 * <p>
 * This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.
 */
public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int steps = 0;
        if (A == null && B == null) {
            return steps;
        }
        if (A.length == 0 || B.length == 0) {
            return steps;
        }

        for (int i = 0; i < A.length - 1; i++) {
            int x = Math.abs(A[i + 1] - A[i]);
            int y = Math.abs(B[i + 1] - B[i]);
            steps += Math.max(x, y);
        }
        return steps;
    }
}

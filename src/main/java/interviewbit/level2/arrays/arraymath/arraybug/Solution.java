package interviewbit.level2.arrays.arraymath.arraybug;

import java.util.ArrayList;

/**
 * The following code is supposed to rotate the array A by B positions.
 * <p>
 * So, for example,
 * <p>
 * <p>
 * A : [1 2 3 4 5 6]
 * B : 1
 * <p>
 * The output :
 * <p>
 * [2 3 4 5 6 1]
 * However, there is a small bug in the problem. Fix the bug and submit the problem.
 */
public class Solution {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B) % A.size()));
        }
        return ret;
    }
}

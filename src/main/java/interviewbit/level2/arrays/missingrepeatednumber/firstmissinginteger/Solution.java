package interviewbit.level2.arrays.missingrepeatednumber.firstmissinginteger;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * Example:
 * Given [1,2,0] return 3,
 * [3,4,-1,1] return 2,
 * [-8, -7, -6] returns 1
 * Your algorithm should run in O(n) time and use constant space.
 */
public class Solution {
    public int firstMissingPositive(ArrayList<Integer> a) {
        int count = 1;// first positive integer
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 0) {
                if (a.get(i) == count) {
                    count++;
                } else {
                    return count;
                }
            }
        }
        return count;
    }
}

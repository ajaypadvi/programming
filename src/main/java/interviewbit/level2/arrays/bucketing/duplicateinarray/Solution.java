package interviewbit.level2.arrays.bucketing.duplicateinarray;

import java.util.List;

/**
 * Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.
 * <p>
 * Sample Input:
 * <p>
 * [3 4 1 4 1]
 * Sample Output:
 * <p>
 * 1
 * If there are multiple possible answers ( like in the sample case above ), output any one.
 * <p>
 * If there is no duplicate, output -1
 */
public class Solution {

    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        int result = -1;
        if (a == null || a.size() == 0)
            return result;
        int[] temp = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            if (temp[a.get(i)] == 1) {
                result = a.get(i);
                break;
            } else {
                temp[a.get(i)] = 1;
            }
        }
        return result;
    }
}

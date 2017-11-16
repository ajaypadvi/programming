package interviewbit.level2.maths.adhoc.hammingdistance1;

import java.util.List;

public class Solution {

    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int total = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            for (int num : A) {
                if ((num >> i & 1) == 1) {
                    count++;
                }
            }
            total += count * (A.size() - count);
        }
        return total;
    }
}

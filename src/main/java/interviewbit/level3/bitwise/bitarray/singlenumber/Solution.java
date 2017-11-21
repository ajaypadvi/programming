package interviewbit.level3.bitwise.bitarray.singlenumber;

import java.util.List;

/*
Given an array of integers, every element appears twice except for one. Find that single one.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Example :
Input : [1 2 2 3 1]
Output : 3
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public int singleNumber(final List<Integer> a) {
        int result = 0;
        int x, sum;
        final int INT_SIZE = 32;
        // Iterate through every bit
        for (int i = 0; i < INT_SIZE; i++) {
            // Find sum of set bits at ith position in all
            // array elements
            sum = 0;
            x = (1 << i);
            for (int j = 0; j < a.size(); j++) {
                if ((a.get(j) & x) == 0)
                    sum++;
            }
            // The bits with sum not multiple of 3, are the
            // bits of element with single occurrence.
            if ((sum % 3) == 0)
                result |= x;
        }
        return result;
    }
}

package interviewbit.level2.arrays.simulation.maxnonnegativesubarray;

import java.util.ArrayList;

/*

Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.
Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).
Example:
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]
NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index
 */
public class Solution {

    public ArrayList<Integer> maxSet(ArrayList<Integer> a) {
        ArrayList<Integer> maxRange = new ArrayList<>();
        ArrayList<Integer> currentRange = new ArrayList<>();
        long current = 0, max = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                //If encounters positive integer then record the range as well as record the sum
                current += a.get(i);
                currentRange.add(a.get(i));
                if (current > max || (current == max && currentRange.size() > maxRange.size())) {
                    max = current;
                    maxRange.clear();
                    maxRange.addAll(currentRange);
                }
            } else {
                //Clears current variables
                current = 0;
                currentRange.clear();
            }
        }
        return maxRange;
    }
}

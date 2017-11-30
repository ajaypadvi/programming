package interviewbit.level3.binarysearch.rotatedarray;

import java.util.ArrayList;

public class Solution {
    /**
     * In order to calculate number of rotations of circularly rotated array , the index of minimum elemnts id always equals to number of rotations that have been performed on the array
     * So we need to find out the minimum elemnt inside an array to calculate the number of rotations that have been performed
     * The above property holds true for those arrays which does not contains duplicate elements
     * If array contains duplicate elements then their has o be separate algorithm
     * We can use binary search algorithm to calculate minimum element inside circularly sorted array
     *
     * @param a
     * @return
     */
    public int findNumberOfRotations(ArrayList<Integer> a) {
        int rotations = 0;
        if (a == null || a.size() == 1)
            return rotations;
        int n = a.size();
        int low = 0, high = n - 1, mid;
        while (low <= high) {
            //Case 1 : If element at the low index is equals to element at the high index then array is already sorted and their are typically no rotations fpr the sub-array/array which is bound by low and high bounds
            // hence return low as the index of minimum element
            if (a.get(low) <= a.get(high)) { //here we checked for <= even if array does not contains any duplicates is because for the low=high condition
                return low;
            }
            mid = low + (high - low) / 2;

            // Case 2: Now calculate the pivot property(pivot is the minimum element )
            // The pivot property is that an element at the left and right of pivot element is always greater than pivot ie pivot is the only element inside circulalry sorted array which has its left and right element greater than it
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;
            if (a.get(mid) <= a.get(next) && a.get(mid) <= a.get(prev)) {
                return mid;
            } else if (a.get(mid) <= a.get(high)) {
                // if the above condition holds true then array from mid to high is sorted already and we cannot find minimum element within that range then we reduce the range by assigning high to mid -1
                high = mid - 1;
            } else if (a.get(mid) >= a.get(low)) {
                // if the above condition holds true then array from low to mid is sorted already and we cannot find minimum element within that range then we increase low to mid + 1
                low = mid + 1;
            }


        }
        return rotations;
    }
}

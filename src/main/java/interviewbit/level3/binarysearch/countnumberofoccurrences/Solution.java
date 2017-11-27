package interviewbit.level3.binarysearch.countnumberofoccurrences;

import java.util.List;

/*
Given a sorted array of integers, find the number of occurrences of a given target value.
Your algorithm’s runtime complexity must be in the order of O(log n).
If the target is not found in the array, return 0

**Example : **
Given [5, 7, 7, 8, 8, 10] and target value 8,
return 2.

PROBLEM APPROACH :

For complete solution, look at the hint.
 */
public class Solution {
    /**
     * This solution is applicable only when the array os sorted when the the question is asked of we want to find the number of occurrences for
     * an element inside sorted array then we ned to use binary search.
     *
     * @param a
     * @param b
     * @return
     */
    // DO NOT MODIFY THE LIST
    public int findCountLessEfficient(final List<Integer> a, int b) {
        int occurrences = 0;
        int length = a.size();
        int low = 0, high = length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a.get(mid) == b) {
                //Now look at left and right for the same number
                //if found at left then keep looking at left until different number is found
                //or else found at righ then keep looking right until different number is found
                //Time complexity of this algorithm is still O(N) in worst case as if an array consist of all same elements b then we will end up traversing each and every element sequentiallly.
                occurrences++;
                int temp = mid;
                if (temp - 1 >= 0) {//looking at left
                    temp--;
                    while (temp >= 0 && a.get(temp) == b) {
                        occurrences++;
                        temp--;
                    }
                }
                temp = mid;
                if (temp < length) {
                    temp++;
                    while (temp < length && a.get(temp) == b) {
                        occurrences++;
                        temp++;
                    }
                }
                return occurrences;
            } else if (b < a.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return occurrences;
    }

    /**
     * This is the more efficient method of finding total occurrences of integer inside an array of sorted elements
     * this basically works on the idea of calculating first and last occurrnce using binary search method
     * so here binary search algorithm is applied on an array twice so time complexity would be  O(log n) + O(log n) ==2 * O(log n) which approximately equals to O(log n) which is much better than the one above
     *
     * @param a
     * @param b
     * @return
     */
    // DO NOT MODIFY THE LIST
    public int findCountEfficient(final List<Integer> a, int b) {
        int firstOccurrence = binarySearch(a, b, true);
        if (firstOccurrence == -1)
            return 0;
        int lastOccurrence = binarySearch(a, b, false);
        return lastOccurrence - firstOccurrence + 1;
    }

    /**
     * @param a
     * @param b
     * @param searchFirst flag indicating whether you want search for the first or last occurrence of the integer in an array
     *                    true indicates find first occurrence
     *                    false indicates find last occurrence
     * @return
     */
    public static int binarySearch(List<Integer> a, int b, boolean searchFirst) {
        int result = -1;
        int length = a.size();
        int low = 0, high = length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (a.get(mid) == b) {
                result = mid;
                if (searchFirst) {
                    high = mid - 1; //Go on searching towards left (lower indices)
                } else {
                    low = mid + 1; //Go on searching towards right (higher indices)
                }
            } else if (b < a.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

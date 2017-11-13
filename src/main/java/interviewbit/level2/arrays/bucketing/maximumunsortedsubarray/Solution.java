package interviewbit.level2.arrays.bucketing.maximumunsortedsubarray;

import java.util.ArrayList;

/*

You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
If A is already sorted, output -1.

Example :

Input 1:

A = [1, 3, 2, 4, 5]

Return: [1, 2]

Input 2:

A = [1, 2, 3, 4, 5]

Return: [-1]
In the above example(Input 1), if we sort the subarray A1, A2, then whole array A should get sorted.

SolutionHint::Assume that Al, …, Ar is the minimum-unsorted-subarray which is to be sorted, then subarrays A0, …, Al-1 and Ar+1, …, AN-1 will be in sorted(ascending) order.
 */
public class Solution {
    /**
     * Examples:
     * 1) If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60], your program should be able to find that the subarray lies between the indexes 3 and 8.
     * 2) If the input array is [0, 1, 15, 25, 6, 7, 30, 40, 50], your program should be able to find that the subarray lies between the indexes 2 and 5.
     * <p>
     * Find the candidate unsorted subarray
     * 1)<p>
     * a) Scan from left to right and find the first element which is greater than the next element. Let s be the index of such an element. In the above example 1, s is 3 (index of 30).
     * b) Scan from right to left and find the first element (first in right to left order) which is smaller than the next element (next in right to left order). Let e be the index of such an element. In the above example 1, e is 7 (index of 31).
     * <p>
     * 2) Check whether sorting the candidate unsorted subarray makes the complete array sorted or not. If not, then include more elements in the subarray.
     * a) Find the minimum and maximum values in arr[s..e]. Let minimum and maximum values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40 respectively.
     * b) Find the first element (if there is any) in arr[0..s-1] which is greater than min, change s to index of this element. There is no such element in above example 1.
     * c) Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max, change e to index of this element. In the above example 1, e is changed to 8 (index of 35)
     * 3) Print s and e.
     *
     * @param A
     * @return
     */
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> list = new ArrayList<>();
        int s = 0, e = A.size() - 1, min = 0, max = 0;
        //a) Scan from left to right and find the first element which is greater than the next element. Let s be the index of such an element. In the above example 1, s is 3 (index of 30).
        for (s = 0; s < A.size() - 1; s++) {
            if (A.get(s) > A.get(s + 1)) {
                break;
            }
        }

        if (s == A.size() - 1) {
            //The complete array is sorted
            list.add(-1);
            return list;
        }
        // b) Scan from right to left and find the first element (first in right to left order) which is smaller than the next element (next in right to left order). Let e be the index of such an element. In the above example 1, e is 7 (index of 31).
        for (e = A.size() - 1; e > 0; e--) {
            if (A.get(e) < A.get(e - 1)) {
                break;
            }
        }

        //a) Find the minimum and maximum values in arr[s..e]. Let minimum and maximum values be min and max. min and max for [30, 25, 40, 32, 31] are 25 and 40 respectively.
        min = A.get(s);
        max = A.get(s);
        for (int i = s + 1; i <= e; i++) {
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }

        //b) Find the first element (if there is any) in arr[0..s-1] which is greater than min, change s to index of this element. There is no such element in above example 1.
        for (int i = 0; i < s; i++) {
            if (A.get(i) > min) {
                s = i;
                break;
            }
        }
        //c) Find the last element (if there is any) in arr[e+1..n-1] which is smaller than max, change e to index of this element. In the above example 1, e is changed to 8 (index of 35)
        for (int i = A.size() - 1; i >= e + 1; i--) {
            if (A.get(i) < max) {
                e = i;
                break;
            }
        }
        list.add(s);
        list.add(e);

        return list;
    }
}

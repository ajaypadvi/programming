package interviewbit.level2.arrays.bucketing.maxdistance;

import com.sun.org.apache.bcel.internal.generic.LMUL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array A of integers, find the maximum of  j - i  subjected to the constraint of  A[i] <= A[j] .

If there is no solution possible, return  -1 .

Example :

A : [3 5 4 2]

Output : 2
for the pair (3, 4)


 */
public class Solution {
    // DO NOT MODIFY THE LIST

    /**
     * This question was asked in Morgan stanley
     * Method 1 (Simple but Inefficient)
     * Run two loops. In the outer loop, pick elements one by one from left. In the inner loop, compare the picked element with the elements starting from right side.
     * Stop the inner loop when you see an element greater than the picked element and keep updating the maximum j-i so far.
     * Time Complexity O(n^2)
     *
     * @param a
     * @return
     */
    public int maximumGap1(final List<Integer> a) {
        int maximumDistance = -1;
        int rightValue = 0, leftValue = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = a.size() - 1; j > i; j--) {
                if (a.get(j) >= a.get(i) && maximumDistance < (j - 1)) {
                    maximumDistance = j - i;
                    rightValue = j;
                    leftValue = i;
                }
            }
        }
        System.out.println("Maximum distance = " + maximumDistance + " for (" + leftValue + "," + rightValue + ")");
        return maximumDistance;
    }

    /**
     * To solve this problem, we need to get two optimum indexes of arr[]:
     * left index i and right index j.
     * For an element arr[i], we do not need to consider arr[i] for left index if there is an element smaller than arr[i] on left side of arr[i].
     * Similarly, if there is a greater element on right side of arr[j] then we do not need to consider this j for right index.
     * So we construct two auxiliary arrays LMin[] and RMax[] such that LMin[i] holds the smallest element on left side of arr[i] including arr[i],
     * and RMax[j] holds the greatest element on right side of arr[j] including arr[j].
     * After constructing these two auxiliary arrays, we traverse both of these arrays from left to right.
     * While traversing LMin[] and RMa[] if we see that LMin[i] is greater than RMax[j], then we must move ahead in LMin[] (or do i++)
     * because all elements on left of LMin[i] are greater than or equal to LMin[i]. Otherwise we must move ahead in RMax[j] to look for a greater j – i value.
     * <p>
     */
    public int maximumGap2(final List<Integer> a) {
        int n = a.size();

        int RMax[] = new int[n];
        int LMin[] = new int[n];

        /* Construct LMin[] such that LMin[i] stores the minimum value
           from (arr[0], arr[1], ... arr[i]) */
        LMin[0] = a.get(0);
        for (int i = 1; i < n; ++i)
            LMin[i] = Math.min(a.get(i), LMin[i - 1]);

        /* Construct RMax[] such that RMax[j] stores the maximum value
           from (arr[j], arr[j+1], ..arr[n-1]) */
        RMax[n - 1] = a.get(n - 1);
        for (int j = n - 2; j >= 0; --j)
            RMax[j] = Math.max(a.get(j), RMax[j + 1]);
        /* Traverse both arrays from left to right to find optimum j - i
           This process is similar to merge() of MergeSort */
        int i = 0, j = 0, maxDiff = -1;
        while (j < n && i < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            } else
                i = i + 1;
        }
        //System.out.println("LeftMin = " + Arrays.toString(LMin));
        //System.out.println("RightMax = " + Arrays.toString(RMax));
        return maxDiff;
    }
}

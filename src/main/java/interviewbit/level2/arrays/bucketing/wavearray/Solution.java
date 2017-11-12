package interviewbit.level2.arrays.bucketing.wavearray;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]
 NOTE : If there are multiple answers possible, return the one that is lexicographically smallest , so in example case u will return [2,1,4,3]
 */
public class Solution {
    /**
     * A Simple Solution is to use sorting. First sort the input array, then swap all adjacent elements.
     * <p>
     * For example, let the input array be {3, 6, 5, 10, 7, 20}. After sorting, we get {3, 5, 6, 7, 10, 20}. After swapping adjacent elements, we get {5, 3, 7, 6, 20, 10}.
     *
     * @param a
     * @return
     */
    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        //Sort the collection in ascending order as it i mentioned in the note that if we If there are multiple answers possible, return the one that is lexicographically smallest , so in example case u will return [2,1,4,3]
        Collections.sort(a);
        for (int i = 0; i < a.size() - 1; i += 2) {
            Integer temp = a.get(i);
            a.set(i, a.get(i + 1));
            a.set(i + 1, temp);
        }
        return a;
    }
}

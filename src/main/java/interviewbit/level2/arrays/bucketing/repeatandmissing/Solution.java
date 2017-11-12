package interviewbit.level2.arrays.bucketing.repeatandmissing;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a read only array of n integers from 1 to n.
 * <p>
 * Each integer appears exactly once except A which appears twice and B which is missing.
 * <p>
 * Return A and B.
 * <p>
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * Note that in your output A should precede B.
 * <p>
 * Example:
 * <p>
 * Input:[3 1 2 5 3]
 * <p>
 * Output:[3, 4]
 * <p>
 * A = 3, B = 4
 */
public class Solution {

    /**
     * Traverse the array. While traversing, use absolute value of every element as
     * index and make the value at this index as negative to mark it visited.
     * If something is already marked negative then this is the repeating element. To find missing, traverse the array again and look for a positive value.
     * <p>
     * NOTE:: This solution fails the test on interview bit test cases as it mutates the list but here it passes
     * Below is the error I get
     * Exception in thread "main" java.lang.UnsupportedOperationException: Read only list. Mutations not allowed!
     * at MyList.set(Main.java:38)
     * at Solution.repeatedNumber(Solution.java:10)
     * at Main.main(Main.java:322)
     *
     * @param a
     * @return
     */
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>(2);
        if (a == null || a.size() == 0) {
            return result;
        }
        for (int i = 0; i < a.size(); i++) {
            if (a.get(Math.abs(a.get(i)) - 1) > 0) {
                a.set(Math.abs(a.get(i)) - 1, -Math.abs(a.get(Math.abs(a.get(i)) - 1)));
            } else {
                result.add(Math.abs(a.get(i)));
            }
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > 0) {
                result.add(i + 1);
                break;
            }
        }
        return result;
    }

    /**
     * This one gets accepted but it is making use of an extra space..IMO its against the description given in problem statement that
     * "Could you implement it without using extra memory?"
     *
     * @param a
     * @return
     */
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber1(final List<Integer> a) {
        ArrayList<Integer> output = new ArrayList<>();

        int[] count = new int[a.size() + 1];
        for (int i = 0; i < a.size(); i++) {
            if (count[a.get(i)] == 1) {
                output.add(a.get(i));
            } else {
                count[a.get(i)] = 1;
            }
        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] != 1)
                output.add(i);
        }
        return output;
    }
}

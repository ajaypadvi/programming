package interviewbit.level2.arrays.arraymath.addone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits,
 * <p>
 * add 1 to the number ( increment the number represented by the digits ).
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 * <p>
 * Example:
 * <p>
 * If the vector has [1, 2, 3]
 * <p>
 * the returned vector should be [1, 2, 4]
 * <p>
 * as 123 + 1 = 124.
 * <p>
 * NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
 * For example, for this problem, following are some good questions to ask :
 * Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
 * A : For the purpose of this question, YES
 * Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
 * A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 */
public class Solution {
    public int[] plusOne(int[] A) {

        List<Integer> result = new ArrayList<>();
        boolean carryFlag = true;
        for (int i = A.length - 1; i >= 0; i--) {
            int sum = A[i];
            if (carryFlag && (sum = (A[i] + 1)) == 10) {
                result.add(0);
                continue;
            }
            carryFlag = false;
            result.add(sum);
        }
        if (carryFlag == true) {
            result.add(1);
        }

        //reverse the collection and remove all leading zeroes
        Collections.reverse(result);
        Iterator<Integer> iterator = result.iterator();
        boolean foundFirstNonZeroElement = false;
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number == 0 && !foundFirstNonZeroElement) {
                iterator.remove();
            } else {
                break;
            }
        }

        //Since output is of type Array int[] hence forming the result array
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
}

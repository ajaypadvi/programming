package interviewbit.level2.maths.adhoc.FizzBuzz;

import java.util.ArrayList;

/**
 * Given a positive integer N, print all the integers from 1 to N. But for multiples of 3 print “Fizz” instead of the number and for the multiples of 5 print “Buzz”. Also for number which are multiple of 3 and 5, prints “FizzBuzz”.
 * <p>
 * Example
 * <p>
 * N = 5
 * Return: [1 2 Fizz 4 Buzz]
 * Note: Instead of printing the answer, you have to return it as list of strings.
 */
public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }

        }
        return list;
    }
}

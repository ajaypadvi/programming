package interviewbit.level2.maths.adhoc.hammingdistance;

import java.util.ArrayList;
import java.util.List;

/*
Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.
For example,
HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 (111).
Given an array of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
Return the answer modulo 1000000007.
Example
Let f(x, y) be the hamming distance defined above.

A=[2, 4, 6]

We return,
f(2, 2) + f(2, 4) + f(2, 6) +
f(4, 2) + f(4, 4) + f(4, 6) +
f(6, 2) + f(6, 4) + f(6, 6) =

0 + 2 + 1
2 + 0 + 1
1 + 1 + 0 = 8
 */
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int sum = 0;
        if (A == null || A.size() == 0) {
            return sum;
        }

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        for (int outer = 0; outer < A.size(); outer++) {
            for (int inner = 0; inner < A.size(); inner++) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(A.get(outer));
                pair.add(A.get(inner));
                pairs.add(pair);
            }
        }
        for (int i = 0; i < pairs.size(); i++) {
            //calculate the hamming distance
            String first = findDigitsInBinary(pairs.get(i).get(0));
            String second = findDigitsInBinary(pairs.get(i).get(1));
            int distance = hammingDistance(first, second);
            System.out.println("distance between " + first + " " + second + " :" + distance);
            sum += distance;
        }
        return sum % 1000000007;
    }

    public static int hammingDistance(String first, String second) {
        int distance = 0;
        int zeroesToBePadded = 0;
        if (first.length() > second.length()) {
            zeroesToBePadded = first.length() - second.length();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < zeroesToBePadded; i++) {
                builder.append("0");
            }
            builder.append(second);
            second = builder.toString();
        } else if (second.length() > first.length()) {
            zeroesToBePadded = second.length() - first.length();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < zeroesToBePadded; i++) {
                builder.append("0");
            }
            builder.append(first);
            first = builder.toString();
        }

        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    distance++;
                }
            }
        }
        return distance;
    }

    public static String findDigitsInBinary(int a) {
        StringBuilder response = new StringBuilder();
        if (a == 1 || a == 0) {
            return String.valueOf(a);
        }

        int remainder;
        int quotient;
        while (a > 0) {
            quotient = a / 2;
            remainder = a % 2;
            a = quotient;
            response.append(String.valueOf(remainder));
        }
        return response.reverse().toString();
    }

}

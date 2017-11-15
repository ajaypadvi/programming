package interviewbit.level2.maths.binaryrepresentation;

/**
 * Given a number N >= 0, find its representation in binary.
 * <p>
 * Example:
 * <p>
 * if N = 6,
 * <p>
 * binary form = 110
 */
public class Solution {
    public String findDigitsInBinary(int a) {
        if (a == 0 || a == 1) {
            return String.valueOf(a);
        }
        StringBuilder response = new StringBuilder();
        int remainder, quotient;
        while (a > 0) {
            quotient = a / 2;
            remainder = a % 2;
            a = quotient;
            response.append(remainder);
        }
        return response.reverse().toString();
    }
}

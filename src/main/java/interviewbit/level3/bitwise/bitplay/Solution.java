package interviewbit.level3.bitwise.bitplay;

/*
Write a function that takes an unsigned integer and returns the number of 1 bits it has.

Example:

The 32-bit integer 11 has binary representation

00000000000000000000000000001011
so the function should return 3.

Note that since Java does not have unsigned int, use long for Java
 */
public class Solution {
    public int numSetBits(long a) {
        int result = 0;
        if (a == 0) {
            return result;
        }
        long remainder = 0, quotient = 0;
        StringBuilder builder = new StringBuilder();
        while (a > 0) {
            remainder = a % 2;
            quotient = a / 2;
            a = quotient;
            builder.append(remainder);
        }
        builder.reverse();
        int index = 0;
        String bitRepresentation = builder.toString();
        while (index < bitRepresentation.length()) {
            if (bitRepresentation.charAt(index) == '1') {
                result++;
            }
            index++;
        }

        return result;
    }
}

package interviewbit.level2.maths.digitoperation.reverse;

/*
Reverse digits of an integer.

Example1:

x = 123,

return 321
Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer
 */
public class Solution {
    public int reverse(int a) {
        boolean isNegative = false;
        if (a < 0) {
            isNegative = true;
            a = Math.abs(a);
        }
        StringBuffer buffer = new StringBuffer(Integer.toString(a));
        for (int k = 0; k < buffer.length() / 2; k++) {
            char temp = buffer.charAt(k);
            buffer.setCharAt(k, buffer.charAt((buffer.length() - 1) - k));
            buffer.setCharAt((buffer.length() - 1) - k, temp);
        }
        try {
            if (isNegative) {
                a = -Integer.parseInt(buffer.toString());
            } else {
                a = Integer.parseInt(buffer.toString());
            }
        } catch (NumberFormatException ex) {
            a = 0;
        }
        return a;
    }
}

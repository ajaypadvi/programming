package interviewbit.level3.string.stringmath.addbinarystrings;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * Example:
 * <p>
 * a = "100"
 * <p>
 * b = "11"
 * Return a + b = “111”.
 */
public class Solution {
    public String addBinary(String a, String b) {
        Result r = new Result("", '0');
        if (a.length() != b.length()) {
            if (a.length() > b.length()) {
                //add left padding of zeroes to b
                int diff = a.length() - b.length();
                for (int i = 0; i < diff; i++) {
                    b = '0' + b;
                }
            } else {
                //add left padding of zeroes to a
                int diff = b.length() - a.length();
                for (int i = 0; i < diff; i++) {
                    a = '0' + a;
                }
            }
        }
        int index = a.length() - 1;
        while (index >= 0) {
            r = add(a.charAt(index), b.charAt(index), r.carry, r.result);
            index--;
        }
        String result = r.result;
        if (r.carry == '1')
            result = r.carry + result;
        return result;
    }

    public static class Result {
        String result;
        char carry;

        Result(String result, char carry) {
            this.result = result;
            this.carry = carry;
        }
    }

    public static Result add(char c1, char c2, char carry, String result) {
        Result r = null;
        if (carry == '0') {
            if (c1 == '0' && c2 == '0') {
                r = new Result('0' + result, '0');
            } else if (c1 == '0' && c2 == '1') {
                r = new Result('1' + result, '0');
            } else if (c1 == '1' && c2 == '0') {
                r = new Result('1' + result, '0');
            } else if (c1 == '1' && c2 == '1') {
                r = new Result('0' + result, '1');
            }
        } else {
            if (c1 == '0' && c2 == '0') {
                r = new Result('1' + result, '0');
            } else if (c1 == '0' && c2 == '1') {
                r = new Result('0' + result, '1');
                result = '0' + result;
                carry = '1';
            } else if (c1 == '1' && c2 == '0') {
                r = new Result('0' + result, '1');
            } else if (c1 == '1' && c2 == '1') {
                r = new Result('1' + result, '1');
            }
        }
        return r;
    }

}

package interviewbit.level3.string.stringmath.romantointeger;

/**
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Read more details about roman numerals at Roman Numeric System
 * <p>
 * Example :
 * <p>
 * Input : "XIV"
 * Return : 14
 * Input : "XX"
 * Output : 20
 */
public class Solution {
    /**
     * Roman numerals are based on below symbols.
     * I = 1
     * V = 5
     * X = 10
     * L = 50
     * C = 100
     * D = 500
     * M = 1000
     *
     * If wants to remember above combination then the can be arraynged in reversed order and say "MDCLXVI"
     * A number in Roman Numerals is a string of these symbols written in descending order(e.g. M’s first, followed by D’s, etc.). However, in a few specific cases, to avoid four characters being repeated in succession (such as IIII or XXXX), subtractive notation is often used as follows:
     * <p>
     * I placed before V or X indicates one less, so four is IV (one less than 5) and 9 is IX (one less than 10).
     * X placed before L or C indicates ten less, so forty is XL (10 less than 50) and 90 is XC (ten less than a hundred).
     * C placed before D or M indicates a hundred less, so four hundred is CD (a hundred less than five hundred) and nine hundred is CM (a hundred less than a thousand).
     * Algorithm to convert Roman Numerals to Integer Number :
     * <p>
     * Split the Roman Numeral string into Roman Symbols (character).
     * Convert each symbol of Roman Numerals into the value it represents.
     * Take symbol one by one from starting from index 0:
     * If current value of symbol is greater than or equal to the value of next symbol, then add this value to the running total.
     * else subtract this value by adding the value of next symbol to the running total.
     *
     * @param a
     * @return
     */
    public int romanToInt(String a) {
        int result = 0;
        if (a == null) {
            return result;
        }
        a = a.trim();
        if (a.length() == 0) {
            return result;
        }
        int n = a.length();
        for (int i = 0; i < n; i++) {
            int s1 = getValue(a.charAt(i));
            if (i + 1 < n) {
                int s2 = getValue(a.charAt(i + 1));
                if (s2 > s1) {
                    result = result + s2 - s1;
                    i++;
                } else {
                    result = result + s1;
                }
            } else {
                result = result + s1;
            }
        }
        return result;
    }

    public static int getValue(char ch) {
        int decimal = 0;
        switch (ch) {
            case 'I':
                decimal = 1;
                break;
            case 'V':
                decimal = 5;
                break;
            case 'X':
                decimal = 10;
                break;
            case 'L':
                decimal = 50;
                break;
            case 'C':
                decimal = 100;
                break;
            case 'D':
                decimal = 500;
                break;
            case 'M':
                decimal = 1000;
                break;
            default:
                break;
        }
        return decimal;
    }
}


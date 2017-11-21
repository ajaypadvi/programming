package interviewbit.level3.string.stringmath.integertoroman;

import java.util.HashMap;

/**
 * Another question which belongs to the category of questions which are intentionally stated vaguely.
 * Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.
 * <p>
 * Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version
 * <p>
 * Input is guaranteed to be within the range from 1 to 3999.
 * <p>
 * Example :
 * <p>
 * Input : 5
 * Return : "V"
 * <p>
 * Input : 14
 * Return : "XIV"
 * Note : This question has a lot of scope of clarification from the interviewer. Please take a moment to think of all the needed clarifications and see the expected response using “See Expected Output” For the purpose of this question, https://projecteuler.net/about=roman_numerals has very detailed explanations.
 */
public class Solution {
    private static int[] bases = {1000,
            900,
            500,
            400,
            100,
            90,
            50,
            40,
            10,
            9,
            5,
            4,
            1};
    private static HashMap<Integer, String> map = new HashMap<Integer, String>();

    public String intToRoman(int a) {
        setup();
        String result = "";
        for (int i : bases) {
            while (a >= i) {
                result += map.get(i);
                a -= i;
            }
        }
        return result;

    }

    private static void setup() {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }


}

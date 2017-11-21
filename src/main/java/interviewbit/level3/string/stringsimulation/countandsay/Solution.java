package interviewbit.level3.string.stringsimulation.countandsay;

/*
The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11.
11 is read off as two 1s or 21.

21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example:

if n = 2,
the sequence is 11.
 */
public class Solution {
    public String countAndSay(int a) {
        String result = "1";
        for (int i = 1; i < a; i++) {
            result = getCountAndSayRepresentation(result);
        }
        return result;
    }

    public static String getCountAndSayRepresentation(String number) {
        StringBuilder sb = new StringBuilder();
        char currentChar = number.charAt(0);
        int currentCharCount = 1;
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) != currentChar) {
                sb.append(currentCharCount);
                sb.append(currentChar);
                currentChar = number.charAt(i);
                currentCharCount = 1;
            } else {
                currentCharCount++;
            }
        }
        sb.append(currentCharCount);
        sb.append(currentChar);
        return sb.toString();
    }
}

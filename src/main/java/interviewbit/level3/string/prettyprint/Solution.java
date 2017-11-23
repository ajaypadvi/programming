package interviewbit.level3.string.prettyprint;

import java.util.ArrayList;
import java.util.List;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P.......A........H.......N
 * ..A..P....L....S....I...I....G
 * ....Y.........I........R
 * And then read line by line: PAHNAPLSIIGYIR
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
 * *Example 2 : **
 * ABCD, 2 can be written as
 * <p>
 * A....C
 * ...B....D
 * and hence the answer would be ACBD.
 */
public class Solution {
    /**
     * The idea is to traverse the input string. Every character has to go to one of the rows. One by one add all characters to different rows. Below is algorithm:
     * <p>
     * 1) Create an array of n strings, arr[n]
     * 2) Initialize direction as "down" and row as 0. The
     * direction indicates whether we need to move up or
     * down in rows.
     * 3) Traverse the input string, do following for every
     * character.
     * a) Append current character to string of current row.
     * b) If row number is n-1, then change direction to 'up'
     * c) If row number is 0, then change direction to 'down'
     * d) If direction is 'down', do row++.  Else do row--.
     * 4) One by one print all strings of arr[].
     *
     * @param a
     * @param b
     * @return
     */
    public String convert(String a, int b) {
        StringBuilder result = new StringBuilder();
        if (a == null || a.length() == 0)
            return result.toString();
        if (b == 1)
            return a;

        List[] rows = new ArrayList[b];
        for (int i = 0; i < b; i++) {
            rows[i] = new ArrayList<String>();
        }

        int row = 0;
        boolean down = true;
        for (int i = 0; i < a.length(); i++) {
            if (row == 0) {
                down = true;
            } else if (row == b - 1) {
                down = false;
            }

            rows[row].add(a.charAt(i));

            if (down) {
                row++;
            } else {
                row--;
            }
        }

        for (List list : rows) {
            for (int i = 0; i < list.size(); i++) {
                result.append(list.get(i));
            }
        }

        return result.toString();
    }
}

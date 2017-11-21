package interviewbit.level3.string.stringparsing.validipaddresses;

import java.util.ArrayList;

/*
Given a string containing only digits, restore it by returning all possible valid IP address combinations.
A valid IP address must be in the form of A.B.C.D, where A,B,C and D are numbers from 0-255. The numbers cannot be 0 prefixed unless they are 0.
Example:
Given “25525511135”,
return [“255.255.11.135”, “255.255.111.35”]. (Make sure the returned strings are sorted in order)
 */
public class Solution {
    public ArrayList<String> restoreIpAddresses(String number) {
        ArrayList<String> result = new ArrayList<>();
        int l = number.length() - 3;
        for (int a = 0; a < 3 && a < l; a++) {
            for (int b = 0; b < 3 && b < l - a; b++) {
                for (int c = 0; c < 3 && c < l - a - b; c++) {
                    StringBuilder sb = new StringBuilder(number);
                    if (Integer.parseInt(sb.substring(0, a + 1)) < 256
                            && Integer.parseInt(sb.substring(a + 1, a + b + 2)) < 256
                            && Integer.parseInt(sb.substring(a + b + 2, a + b + c + 3)) < 256
                            && Integer.parseInt(sb.substring(a + b + c + 3)) < 256) {
                        sb.insert(a + 1, ".");
                        sb.insert(a + b + 3, ".");
                        sb.insert(a + b + c + 5, ".");
                        result.add(sb.toString());
                    }
                }
            }
        }
        return result;
    }
}

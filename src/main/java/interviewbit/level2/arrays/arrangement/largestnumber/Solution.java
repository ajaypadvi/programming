package interviewbit.level2.arrays.arrangement.largestnumber;

import java.util.*;

/*
Given a list of non negative integers, arrange them such that they form the largest number.
For example:
Given [3, 30, 34, 5, 9], the largest formed number is 9534330.
Note: The result may be very large, so you need to return a string instead of an integer******IMP.
 */
public class Solution {
    // DO NOT MODIFY THE LIST

    /**
     * Think around what kind of sorting would be needed. Obviously, we can’t simply just sort the numbers or string.
     * <p>
     * Have you considered cases like 27, 271 or 12, 121 ?
     * <p>
     * So the solution to this is we need to combine the two numbers and then sort rather than doing simple sorting on either numbers or strings individually
     * as definitely 27271 is greater than 27127 when two numbers are considered 27,271
     *
     * @param a
     * @return
     */
    public String largestNumber(final List<Integer> a) {
        StringBuilder outputString = new StringBuilder();
        Collections.sort(a, new Comparator<Integer>() {

            @Override
            public int compare(Integer X, Integer Y) {
                StringBuilder XY = new StringBuilder();
                StringBuilder YX = new StringBuilder();

                XY.append(X);
                XY.append(Y);

                YX.append(Y);
                YX.append(X);
                return YX.toString().compareTo(XY.toString());
            }
        });

        boolean foundFirstPositiveInteger = false;
        for (int i = 0; i < a.size(); i++) {
            if (Integer.parseInt(String.valueOf(a.get(i))) != 0
                    || (Integer.parseInt(String.valueOf(a.get(i))) == 0 && foundFirstPositiveInteger)) {
                outputString.append(a.get(i));
                foundFirstPositiveInteger = true;
            }
        }
        if (!foundFirstPositiveInteger)
            return "0";
        return outputString.toString();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(new String[]{"3", "30"}));
        Collections.sort(list);
        System.out.println(list);

        System.out.println("30".compareTo("34"));
        System.out.println("34".compareTo("30"));
        System.out.println("3".compareTo("30"));
        System.out.println("330".compareTo("303"));
        System.out.println("303".compareTo("330"));

    }
}

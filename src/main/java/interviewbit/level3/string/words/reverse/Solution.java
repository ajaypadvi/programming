package interviewbit.level3.string.words.reverse;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

 */
public class Solution {
    public String reverseWords(String a) {
        if (a == null || a.length() == 0) {
            return a;
        }
        a = a.trim();
        ArrayList<String> list = new ArrayList<>();
        int startIndex = 0, endIndex = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                endIndex++;
            } else {
                list.add(a.substring(startIndex, endIndex));
                startIndex = i + 1;
                endIndex++;
            }
        }
        list.add(a.substring(startIndex, endIndex));
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(list.get(i));
            if (i != list.size() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}

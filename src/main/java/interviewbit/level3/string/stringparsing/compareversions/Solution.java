package interviewbit.level3.string.stringparsing.compareversions;

/*
Compare two version numbers version1 and version2.

If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0.
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 1.13 < 1.13.4
 */
public class Solution {
    public static int compareVersion(String A, String B) {
        String[] a = A.split("\\."); // escape '.' in regular expression
        String[] b = B.split("\\.");
        int lenA = a.length;
        int lenB = b.length;
        int index = 0;
        // compare the version
        while (index < lenA && index < lenB) {
            int compare = compare(a[index], b[index]);
            if (compare != 0) {//if compare is non zero then it is either greater than or less than one another so there is no point in checking further array elements and as decision is made we return from this position
                return compare;
            }
            index++;
        }
        // compare the remaining part

        if (index < lenA) {
            return notZero(a, index) ? 1 : 0;
        } else if (index < lenB) {
            return notZero(b, index) ? -1 : 0;
        } else {
            // nothing left in two versions
            return 0;
        }
    }

    private static int compare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int index1 = 0;
        int index2 = 0;
        // skip leading 0s
        while (index1 < len1 && str1.charAt(index1) == '0') {
            index1++;
        }
        while (index2 < len2 && str2.charAt(index2) == '0') {
            index2++;
        }
        if (len1 - index1 != len2 - index2) {
            return (len1 - index1) > (len2 - index2) ? 1 : -1;
        } else {
            while (index1 < len1 && index2 < len2) {
                if (str1.charAt(index1) != str2.charAt(index2)) {
                    return str1.charAt(index1) > str2.charAt(index2) ? 1 : -1;
                }
                index1++;
                index2++;
            }
            return 0;
        }
    }

    // whether remaining part has version larger than 0.0
    private static boolean notZero(String[] strs, int index) {
        int len = strs.length;
        for (int i = index; i < len; i++) {
            if (Long.parseLong(strs[i]) != 0) {
                return true;
            }
        }
        return false;
    }
}
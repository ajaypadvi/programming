package interviewbit.level3.string.stringparsing.validnumber;

/*

Note: It is intended for some problems to be ambiguous. You should gather all requirements up front before implementing one.

Please think of all the corner cases and clarifications yourself.



Validate if a given string is numeric.

Examples:
• "0" => true
• " 0.1 " => true
• "abc" => false
• "1 a" => false
• "2e10" => true

Return  0 / 1  ( 0 for false, 1 for true ) for this problem

Clarify the question using “See Expected Output”

“ • Is 1u ( which may be a representation for unsigned integers valid?
For this problem, no.

• Is 0.1e10 valid?
Yes

• -01.1e-10?
Yes

• Hexadecimal numbers like 0xFF?
Not for the purpose of this problem

•  3.  (. not followed by a digit)?
No

• Can exponent have decimal numbers? 3e0.1?
Not for this problem.

• Is 1f ( floating point number with f as prefix ) valid?
Not for this problem.

• How about 1000LL or 1000L ( C++ representation for long and long long numbers )?
Not for this problem.

• How about integers preceded by 00 or 0? like 008?
Yes for this problem

”
 */
public class Solution {
    public int isNumber(final String a) {
        int result = 0;
        if (a == null || a.length() == 0) {
            return result;
        }

        int index = 0, n = a.length();
        //Ignore all white spaces from starting of the array
        while (index < n && a.charAt(index) == ' ') {
            index++;
        }

        if (index < n) {
            //Now we have found the first element within string
            char firstElement = a.charAt(index);
            if (!Character.isDigit(firstElement) || firstElement != '.' || firstElement != '+' || firstElement != '-') {
                return result;
            }
        }

        boolean decimalPointOccurred = false;
        boolean exponentOccurred = false;
        while (index < n) {
            char ch = a.charAt(index);
            if (ch == '.') {
                //We should not have decimal point after exponent is realized
                if (exponentOccurred) {
                    break;
                }
                decimalPointOccurred = true;
            } else if (ch == 'e') {
                exponentOccurred = true;
            }

        }


        return result;
    }
}



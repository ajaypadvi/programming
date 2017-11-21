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

        String str = a.trim();
        int index = 0, n = str.length();

        if (n == 0)
            return result;

        if (index < n) {
            //Now we have found the first element within string
            char firstElement = str.charAt(index);
            if ((firstElement == '.' || firstElement == '+' || firstElement == '-') && index + 1 < n) {
                index++;
            } else if (Character.isDigit(firstElement)) {
                index++;
            } else {
                return result;
            }
        }

        //boolean decimalPointOccurred = false;
        boolean exponentOccurred = false;
        while (index < n) {
            char ch = str.charAt(index);
            if (ch == '.') {
                //We should not have decimal point after exponent is realized
                if (exponentOccurred) {
                    break;
                }
                //    decimalPointOccurred = true;
                //if the valid decimal point is occurred then we should check for the next char to be a digit or if the decimal point is itself the last remaining character then break
                if ((index + 1 < n && !Character.isDigit(str.charAt(index + 1))) || index + 1 == n) {
                    break;
                }
                index++;
                continue;
            } else if (ch == 'e') {
                exponentOccurred = true;
                //the next char of valid exponent should be either sign or digit
                if (index + 1 < n && !Character.isDigit(str.charAt(index + 1)) && str.charAt(index + 1) != '+' && str.charAt(index + 1) != '-') {
                    break;
                } else if (a.charAt(index + 1) == '+' || str.charAt(index + 1) == '-') {
                    index++;
                }
                index++;
                continue;
            }
            if (!Character.isDigit(ch)) {
                break;
            } else {
                index++;
            }
        }
        if (index == str.length()) {
            result = 1;
        }
        return result;
    }
}



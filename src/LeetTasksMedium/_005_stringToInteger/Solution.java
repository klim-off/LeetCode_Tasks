package LeetTasksMedium._005_stringToInteger;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
The algorithm for myAtoi(string s) is as follows:
Read in and ignore any leading whitespace.
Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
Return the integer as the final result.
 */
public class Solution {
    public static void main(String[] args) {
        String [] s =  {"+", "+-12","   -42", "+1","-","-+12","22", "4193 with words", " words with 4193 "};
        for (int i = 0; i < s.length; i++) {
            System.out.println(myAtoi(s[i]));
        }

    }
    public static int myAtoi(String s) {
        s=s.trim();
        int sLength = s.length();

        if (sLength == 0) return 0;
        if (sLength == 1 && !Character.isDigit(s.charAt(0) )) return 0;
        if (!Character.isDigit(s.charAt(0)) && s.charAt(0) != '-' &&  s.charAt(0) != '+')  return 0;
        if (s.charAt(0) == '-' && !Character.isDigit(s.charAt(1)))  return 0;
        if (s.charAt(0) == '+' && !Character.isDigit(s.charAt(1)))  return 0;

        boolean isDigit = false;
        int startDigit = 0;
        int endDigit = sLength;
        int result = 0;

        for (int i = 0; i < sLength; i++) {
            if (isDigit){
                if (Character.isDigit(s.charAt(i))) {continue;}
                endDigit = i;
                break;
            }
            if (!isDigit && Character.isDigit(s.charAt(i))) {
                startDigit = i;
                isDigit = true;
            }
        }

        try{ result= Integer.parseInt(s.substring(startDigit,endDigit));}
        catch (NumberFormatException numberFormatException){
            if (startDigit !=0 && s.charAt(startDigit-1) == '-')
            {return Integer.MIN_VALUE;}
            return Integer.MAX_VALUE;
        }
        if (startDigit !=0 && s.charAt(startDigit-1) == '-') {result *= -1;}
        return result;
    }

}

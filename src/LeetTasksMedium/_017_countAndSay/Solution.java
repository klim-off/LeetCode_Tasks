package LeetTasksMedium._017_countAndSay;
/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of substrings such that each substring contains exactly one unique digit. Then for each substring, say the number of digits, then say the digit. Finally, concatenate every said digit.
Example 2:

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */
public class Solution {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if(n==1)
            return "1";

        String s=countAndSay(n-1);

        int c=0;
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            c++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                ans.append(c).append(s.charAt(i));
                c=0;
            }
        }
        return ans.toString();
    }
}

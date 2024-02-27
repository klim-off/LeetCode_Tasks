package leetTasks._101_reverseWordsInString;
/*
Given a string s, reverse the order of characters in each word within a sentence
 while still preserving whitespace and initial word order.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
       String [] arrayS = s.split(" ");
       StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayS.length; i++) {
            arrayS[i] = new StringBuilder(arrayS[i]).reverse().toString();
            result = result.append(arrayS[i]+" ");
        }
      return  result.deleteCharAt(result.length()-1).toString();
    }
}

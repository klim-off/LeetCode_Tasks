package leetTasks._029_isPalindrome;

public class Solution {

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
    public  static boolean isPalindrome(String s) {
      String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
      String newSReverse = new StringBuilder(newS).reverse().toString();
     return  (newS.compareTo(newSReverse)==0)?true:false;
    }
}

package leetTasks._055_addDigits;

public class Solution {

    public static void main(String[] args) {
        //int n = 8;
           int n = 52;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int num) {
          if (num <=9) {return num;}
          char[] charArray = String.valueOf(num).toCharArray();
          num=0;
        for (int i = 0; i < charArray.length; i++) {
            num += Character.getNumericValue(charArray[i]);
        }
     return addDigits(num);
    }
}

package leetTasks._039_numberOf1Bits;

public class Solution {

    public static void main(String[] args) {
        int n = 25;
        //   int columnNumber = 52;
        System.out.println(hammingWeight(n));
    }

    public static int hammingWeight(int n) {
        System.out.println(Integer.toBinaryString(n));
      char [] numericArray = Integer.toBinaryString(n).toCharArray();
      int result = 0;
      for (int i = 0; i < numericArray.length; i++) {
           if (numericArray[i] == '1') {
               result++;
           }
        }
     return result;
    }
}

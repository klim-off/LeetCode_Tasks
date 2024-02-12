package leetTasks._086_hammingDistance;

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println((hammingDistance(x,y)));
    }

    public  static int hammingDistance(int x, int y) {
     StringBuilder strX = new StringBuilder(Integer.toBinaryString(x));
     StringBuilder strY = new StringBuilder(Integer.toBinaryString(y));
     int result = 0;
     int difference = 0;
        System.out.println(strX);
        System.out.println(strY);

     if (strX.length() < strY.length() ){
         difference = strY.length() - strX.length();
         for (int i = 0; i < difference; i++) {
             strX.insert(0,"0");
         }
     } else if (strX.length() > strY.length() ) {
         difference = strX.length() - strY.length();
         for (int i = 0; i < difference; i++) {
             strY.insert(0, "0");
         }
     }
        System.out.println(strX);
        System.out.println(strY);
        for (int i = 0; i < strX.length(); i++) {
            if (strX.charAt(i) != strY.charAt(i)) {
                result++;
            }

        }
        System.out.println(strX);
        System.out.println(strY);
     return result;
    }

}

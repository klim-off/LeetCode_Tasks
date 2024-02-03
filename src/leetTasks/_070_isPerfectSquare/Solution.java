package leetTasks._070_isPerfectSquare;

public class Solution {
    public static void main(String[] args) {
        int n = 144;
        System.out.println((isPerfectSquare(n)));
    }

    public static boolean isPerfectSquare(int num) {
     //with SQRT
     //  return (Math.sqrt((double) num) -(int) Math.sqrt((double) num) == 0);
     //without SQRT
       int i=1;
        while(num>0){
            num-=i;
            i+=2;
        }
        return num==0;
    }
}

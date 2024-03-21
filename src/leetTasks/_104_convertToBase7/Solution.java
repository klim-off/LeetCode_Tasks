package leetTasks._104_convertToBase7;

/*
Given an integer num, return a string of its base 7 representation.
Example 1:
Input: num = 100
Output: "202"
Example 2:
Input: num = -7
Output: "-10"
 */
public class Solution {

    public static void main(String[] args) {

        int num = 77;
        System.out.println(convertToBase7(num));
    }

    public  static String convertToBase7(int num) {
        if(num==0)
            return "0";
        String s="";
        String o="-";
        int y=num;
        num=Math.abs(num);
        while(num>0)
        {
            s+=num%7;
            num/=7;
        }
        StringBuilder k=new StringBuilder();
        k.append(s);
        String z=String.valueOf(k.reverse());
        o+=z;
        if(y<0)
            return o;
        return z;

    }
}

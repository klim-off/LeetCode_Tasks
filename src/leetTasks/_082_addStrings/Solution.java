package leetTasks._082_addStrings;

public class Solution {

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println((addStrings(num1,num2)));
    }
    public  static String addStrings(String num1, String num2) {
     // my
        // return String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));

        StringBuilder str = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0, sum;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            sum = digit1 + digit2 + carry;
            str.append(sum % 10);
            carry = sum / 10;
        }

        return str.reverse().toString();
    }
}

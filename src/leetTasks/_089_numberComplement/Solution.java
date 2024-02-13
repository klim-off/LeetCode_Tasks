package leetTasks._089_numberComplement;

public class Solution {
    public static void main(String[] args) {
        int x = 5;
        System.out.println((numberComplement(x)));
    }

    public  static int  numberComplement(int x) {
        String strX = Integer.toBinaryString(x);
        StringBuilder builder = new StringBuilder(Integer.toBinaryString(x));
        System.out.println(builder);
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == '0') {
                builder.replace(i, i + 1, "1");
            } else {
                builder.replace(i, i + 1, "0");
            }
        }
        System.out.println(builder);
        return Integer.parseInt(builder.toString(), 2);
    }
}

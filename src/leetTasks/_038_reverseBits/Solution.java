package leetTasks._038_reverseBits;

public class Solution {

    public static void main(String[] args) {
        int n = 43261596;
        //   int columnNumber = 52;
        System.out.println(reverseBits(n));
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
    StringBuilder binaryBuilder = new StringBuilder(Integer.toBinaryString(n));
        System.out.println(binaryBuilder);
        StringBuilder reverseBinaryBuilder = binaryBuilder.reverse();
        System.out.println(reverseBinaryBuilder);
       return  Integer.parseInt(reverseBinaryBuilder.toString(), 2);
    }
}

package leetTasks._090_licenseKeyFormatting;

public class Solution {
    public static void main(String[] args) {
        int k = 4;
        String  s = "F3Z-2e-9-w";
        System.out.println((licenseKeyFormatting(s,k)));
    }

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder builderS = new StringBuilder(s.replaceAll("-","").toUpperCase());
        int length = builderS.length();
        while (length - k > 0){
            builderS.insert(length-k,"-");
            length -=k;
        }
        return builderS.toString();
    }
}

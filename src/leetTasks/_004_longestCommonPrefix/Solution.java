package leetTasks._004_longestCommonPrefix;

public class Solution {

    public static void main(String[] args) {

        String[] strs = {"flower", "flowe", "flowa"};
        System.out.println(longestCommonPrefix(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        for (int i = 1; i <= strs[0].length(); i++) {
            String prefix = strs[0].substring(0, i);
            int countCommonPrefix = 0;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].startsWith(prefix)) {
                    countCommonPrefix += 1;
                }
            }
            if (countCommonPrefix == strs.length) {
                result = prefix;
            } else {
                return result;
            }
        }
        return result;
    }
}

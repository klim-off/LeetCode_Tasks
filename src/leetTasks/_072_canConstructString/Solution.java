package leetTasks._072_canConstructString;

public class Solution {

    public static void main(String[] args) {
        String ransomNote = "aaax";
        String magazine = "aab";

        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        StringBuilder magazineBuilder = new StringBuilder(magazine);
        boolean result = true;
        int index = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            index = magazineBuilder.indexOf(String.valueOf(ransomNote.charAt(i)));
            if (index >= 0) {
                magazineBuilder.deleteCharAt(index);
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

package leetTasks._099_reverseStr_II;

public class Soluttion {

    public static void main(String[] args) {
        String s = "ababababdsf";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder builderS = new StringBuilder(s);
        int lengthS = s.length();
        if (lengthS <= k) {
            return builderS.reverse().toString();
        }
        StringBuilder toReverse;
        if (lengthS <= (2 * k)) {
            toReverse = new StringBuilder((s.substring(0, k)));
            builderS.replace(0, k, toReverse.reverse().toString());
            return builderS.toString();
        }
        int i = 0;
        while (i + (k * 2) <= lengthS) {
            toReverse = new StringBuilder((s.substring(i, i + k)));
            builderS.replace(i, i + k, toReverse.reverse().toString());
            i += (k * 2);
        }
        if (i < lengthS) {
            if (lengthS - i <= k) {
                toReverse = new StringBuilder((s.substring(i, lengthS)));
                builderS.replace(i, lengthS, toReverse.reverse().toString());
            } else {
                toReverse = new StringBuilder((s.substring(i, i + k)));
                builderS.replace(i, i + k, toReverse.reverse().toString());
            }
        }
        return builderS.toString();
    }
}

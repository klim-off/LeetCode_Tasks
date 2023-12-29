package leetTasks._002_isPolindrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int target = 606;

        System.out.println(isPalindrome(target));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0) {return false;}
        else if ( (x >= 0) && (x <=9) ) {return true;}
        else {

            List <Integer> currentArrayNumeric = new ArrayList<>();
            do{
                currentArrayNumeric.add (x % 10);
                x /=10;
            }while (x>0);

            List <Integer> reverseArrayNumeric = new ArrayList<>(currentArrayNumeric);
            Collections.reverse(currentArrayNumeric);

            return reverseArrayNumeric.equals(currentArrayNumeric);
        }
    }

}

package leetTasks._052_palindromeLinkedList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        ListNode52 tail = new ListNode52(2);
        ListNode52 head = new ListNode52(1,tail);

        System.out.println(isPalindrome( head));
        System.out.println();
    }
    static List <Integer> valueList = new ArrayList<>();
    public static boolean isPalindrome(ListNode52 head) {

        getListValue(head);
        if (valueList.size() == 1) {return true;}
        Collections.reverse(valueList);
        return comparePolidrome(head,0);
    }

    private static boolean comparePolidrome(ListNode52 head, int i) {

        if (head == null) {return true;}
        if (head.val == valueList.get(i)) {
            return  comparePolidrome(head.next,i+1);
        }else return false;
    }

    private static void getListValue(ListNode52 head) {
        if (head != null)
        {
         valueList.add(head.val);
         getListValue(head.next);
        }
    }
}

package leetTasks._031_linkedListCycle;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
         ListNode head = new ListNode(1);

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
            if(s==f){
                return true;
            }
        }
        return false;
    }
}

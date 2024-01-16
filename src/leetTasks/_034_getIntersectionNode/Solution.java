package leetTasks._034_getIntersectionNode;

import leetTasks._032_binTreePreorderTraversal.TreeNode32;

public class Solution {

    public static void main(String[] args) {
        ListNode34 headA = new ListNode34(1);
        ListNode34 headB = new ListNode34(1);
        System.out.println(getIntersectionNode(headA, headB));
    }

    public static ListNode34 getIntersectionNode(ListNode34 headA, ListNode34 headB) {
        //boundary check
        if (headA == null || headB == null) return null;

        ListNode34 a = headA;
        ListNode34 b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while (a != b) {
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}

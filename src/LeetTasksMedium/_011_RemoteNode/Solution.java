package LeetTasksMedium._011_RemoteNode;

import leetTasks._052_palindromeLinkedList.ListNode52;

public class Solution {

    public static void main(String[] args) {
        ListNode11 tail = new ListNode11(3);
        ListNode11 avg = new ListNode11(2,tail);
        ListNode11 head = new ListNode11(1, avg);
        int n = 2;
        removeNthFromEnd(head,n).printNode();

    }

    public static ListNode11 removeNthFromEnd(ListNode11 head, int n) {
        int lengthNode = 0;
        ListNode11 tempNode =  head;

        while (tempNode != null) {
            tempNode = tempNode.next;
            lengthNode ++;
        }
         int position = lengthNode - n;
        if ( position == 0) return head.next;

        ListNode11 prevNode = null;
        tempNode = head;

        for (int i = 0; i < position; i++) {
            prevNode = tempNode;
            tempNode = tempNode.next;

        }

        if (tempNode.next != null) {
            prevNode.next = tempNode.next;
        }else {
            prevNode.next = null;
        }

        return head;
    }
}

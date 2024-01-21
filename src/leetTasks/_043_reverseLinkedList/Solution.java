package leetTasks._043_reverseLinkedList;

public class Solution {

    public static void main(String[] args) {

        ListNode43 tail = new ListNode43(2);
        ListNode43 head = new ListNode43(1,tail);

        System.out.println(reverseList( head));
        System.out.println();
    }

    public  static ListNode43 reverseList(ListNode43 head) {
        return recursive(head);
    }
    public  static ListNode43 recursive(ListNode43 head){
        if(head==null || head.next== null){
            return head;
        }
        ListNode43 newHead= recursive(head.next);
        head.next.next= head;
        head.next= null;
        return newHead;
    }
}

package leetTasks._041_removeElementsLinkList;

public class Solution {

    public static void main(String[] args) {
       ListNode41 head = new ListNode41(1);
       int n = 1;
        System.out.println(removeElements(head,n));
    }

    public  static ListNode41 removeElements(ListNode41 head, int val) {

        ListNode41 dummy = new ListNode41(-1);
        dummy.next = head;
        ListNode41 current = dummy;
        while(current.next!=null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}

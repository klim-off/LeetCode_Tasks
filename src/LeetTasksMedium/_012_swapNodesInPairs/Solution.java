package LeetTasksMedium._012_swapNodesInPairs;



public class Solution {

    public static void main(String[] args) {
        ListNode12 lastTail = new ListNode12(4);
        ListNode12 tail = new ListNode12(3,lastTail);
        ListNode12 avg = new ListNode12(2,tail);
        ListNode12 head = new ListNode12(1, avg);

        swapPairs(head).printNode();
    }

    public static ListNode12 swapPairs(ListNode12 head) {
        if(head == null || head.next == null) return head;
        ListNode12 prev = head;
        ListNode12 curr = head.next;
        ListNode12 ans = curr;
        while(true)
        {
            ListNode12 save = curr.next;
            if(save == null || save.next == null)
            {
                prev.next = save;
                curr.next = prev;
                break;
            }
            prev.next = save.next;
            curr.next = prev;
            prev = save;
            curr = save.next;
        }
        return ans;
    }

}

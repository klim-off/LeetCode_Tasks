package LeetTasksMedium._012_swapNodesInPairs;


public class ListNode12 {
    int val;
    ListNode12 next;
    ListNode12() {}
    ListNode12(int val) { this.val = val; }
    ListNode12(int val, ListNode12 next) { this.val = val; this.next = next; }


    public void printNode() {
        ListNode12 current = this;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }
}

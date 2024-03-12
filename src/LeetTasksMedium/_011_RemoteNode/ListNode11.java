package LeetTasksMedium._011_RemoteNode;



public class ListNode11 {
    int val;
    ListNode11 next;
    ListNode11() {}
    ListNode11(int val) { this.val = val; }
    ListNode11(int val, ListNode11 next) { this.val = val; this.next = next; }


    public void printNode() {
        ListNode11 current = this;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();

    }
}

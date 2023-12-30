package leetTasks._006_mergeSortedList;

public class Solution {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(1);

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next,list2);
                return list1;
            }else {
                list2.next = mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if (list1 == null) {return list2;}
        return list1;
    }

}

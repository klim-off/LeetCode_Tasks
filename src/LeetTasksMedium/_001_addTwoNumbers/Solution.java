package LeetTasksMedium._001_addTwoNumbers;
/*
You are given two non-empty linked lists representing two non-negative integers.
 The digits are stored in reverse order, and each of their nodes contains a single digit.
  Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
 */
public class Solution {
    public static void main(String[] args) {

        ListNode tail_01 = new ListNode(3);
        ListNode central_01 = new ListNode(4, tail_01);
        ListNode l1 = new ListNode(2, central_01);

        ListNode tail_02 = new ListNode(4);
        ListNode central_02 = new ListNode(6, tail_02);
        ListNode l2 = new ListNode(5, central_02);

        System.out.println(addTwoNumbers(l1, l2));
        System.out.println();
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int l1Num = Integer.parseInt(getNumOfNode(l1));
        int l2Num = Integer.parseInt(getNumOfNode(l2));
        String resultNum = String.valueOf(l1Num + l2Num);
        ListNode lNode = null;
        for (int i = 0; i < resultNum.length(); i++) {
            lNode = makeNode(resultNum.charAt(i), lNode);
        }
        return lNode;
    }

    private static ListNode makeNode(char c, ListNode lNode) {
        return new ListNode(Character.digit(c, 10), lNode);
    }

    private static String getNumOfNode(ListNode l1) {
        if (l1.next == null) {
            return String.valueOf(l1.val);
        }
        return getNumOfNode(l1.next) + String.valueOf(l1.val);
    }
}

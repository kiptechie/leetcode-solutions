/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode traversePointer = dummy;
        while(first != null || second != null || carry != 0) {
            if (first != null) {
                carry += first.val;
                first = first.next;
            }
            if (second != null) {
                carry += second.val;
                second = second.next;
            }
            traversePointer.next = new ListNode(carry % 10);
            traversePointer = traversePointer.next;
            carry /= 10;
        }
        return dummy.next;
    }
}
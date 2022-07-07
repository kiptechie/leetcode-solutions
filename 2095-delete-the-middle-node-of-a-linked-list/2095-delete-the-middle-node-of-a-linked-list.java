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
    
    private ListNode findMiddleNodeAndDelete(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head.next;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null && fast.next.next != null) {
            if(fast.next.next.next == null) {
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    
    public ListNode deleteMiddle(ListNode head) {
       return findMiddleNodeAndDelete(head); // O(n)
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode curr = head;
        while(curr != null) {
            seen.add(curr);
            curr = curr.next;
            if(seen.contains(curr)) {
                return curr;
            } 
        }
        return null;
    }
}
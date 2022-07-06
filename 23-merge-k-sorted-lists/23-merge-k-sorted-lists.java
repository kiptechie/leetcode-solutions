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
    public ListNode mergeKLists(ListNode[] lists) {
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode ln1, ListNode ln2) {
                return ln1.val - ln2.val;
            }
        };
        Queue<ListNode> heap = new PriorityQueue<>(comparator);
        for (ListNode ln: lists) {
            if (ln != null) {
                heap.add(ln);
            }
        }
        ListNode head = new ListNode();
        ListNode current = head;
        while(!heap.isEmpty()) {
            current.next = heap.poll();
            current = current.next;
            ListNode next = current.next;
            if (next != null) {
                heap.add(next);
            }
        }
        return head.next;
    }
}
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
    public ListNode middleNode(ListNode head) {
        if(head.next == null)
            return head;      
        ListNode fast = head.next.next;
        // using two pointer technique p1 moves 1 step p2 moves 2 step
        while(true){
            head = head.next;
            if(fast == null || fast.next == null)
                return head;
            fast = fast.next.next;
        }
    }
}
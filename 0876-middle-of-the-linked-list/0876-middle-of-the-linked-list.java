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
        else if(head.next.next == null)
            return head.next;
        
        ListNode fast = head.next.next;
        while(true){
            head = head.next;
            if(fast == null || fast.next == null)
                return head;
            // if(fast.next == null)
            //     return head;
            fast = fast.next.next;
        }
    }
}
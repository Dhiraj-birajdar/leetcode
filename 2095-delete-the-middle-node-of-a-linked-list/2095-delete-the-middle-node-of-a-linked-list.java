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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return head.next;
        if(head.next.next==null){
            head.next = null;
            return head;
        }
        ListNode s ,f;
        for(s=head,f=head.next.next;f!=null && f.next!=null; s=s.next,f=f.next.next);
        s.next = s.next.next;
        return head;        
    }
}
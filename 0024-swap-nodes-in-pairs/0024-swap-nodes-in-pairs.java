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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode a, b;
        for(a=head, b=a.next;a!=null; a=b.next,b=a.next){
            int t = a.val;
            a.val = b.val;
            b.val = t;
            if(b.next==null || b.next.next==null) return head;
        }
        return head;
    }
}
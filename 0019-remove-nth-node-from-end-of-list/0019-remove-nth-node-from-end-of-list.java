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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next == null) return null;
        ListNode a=head,b=a;
        while(n-- > 0){
            b=b.next;
        }
        if(b==null){
            head = head.next;
            return head;
        }
        b = b.next;
        while(b!=null){
            b = b.next;
            a = a.next;
        }
        a.next = a.next.next;
        return head;
    }
}
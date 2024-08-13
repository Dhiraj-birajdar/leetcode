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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null)return head;
        ListNode a=head,b=head,c=b.next;
        for(int i = 1;i<k;i++,a=a.next){
            c=c.next;
        }
        while (c!=null){
            c=c.next;
            b=b.next;
        }
        int t = a.val;
        a.val = b.val;
        b.val = t;
        return head;
    }
}
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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;

        ListNode odd = head,ehead = head.next, even = ehead, temp = even.next;
        while(temp != null && temp.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
            temp = even.next;
        }
        
        if(temp != null){
            odd.next = temp;
            odd = odd.next;
            even.next = null;
        }
        
        odd.next = ehead;
        return head;
    }
}
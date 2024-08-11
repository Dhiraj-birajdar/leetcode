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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int nodeCount = 2;
        ListNode temp = head.next.next,fast;
        for(;temp!=null;nodeCount++,temp=temp.next);
        k=k%nodeCount;
        if(k==0) return head;
        temp = head;
        fast = head;
        while(k-->0){
            fast = fast.next;
        }
        while(fast.next!=null){
            temp=temp.next;
            fast=fast.next;
        }
        fast.next = head;
        head = temp.next;
        temp.next = null;
        return head;
    }
}
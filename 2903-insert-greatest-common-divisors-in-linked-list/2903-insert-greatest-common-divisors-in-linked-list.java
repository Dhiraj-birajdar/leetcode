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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode n1 = head, n2 = head.next, gcd;
        while (n2 != null){
            gcd = new ListNode(gcd(n1.val, n2.val),n2);
            n1.next = gcd;
            n1 = n2;
            n2 = n2.next;
        }
        return head;
    }

    private int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
}
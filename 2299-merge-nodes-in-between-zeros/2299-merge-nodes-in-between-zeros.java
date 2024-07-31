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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode n1 = head,n2=n1.next,temp=null;
        while(n2 != null){
            sum = 0;
            while(n2.val !=0){
                sum+=n2.val;
                n2 = n2.next;
            }
            n1.val = sum;
            temp = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        temp.next = null;
        return head;
    }
}
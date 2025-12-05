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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode curr,next;
        for(curr=head,next=curr.next;curr!=null;){
            while(next!=null && curr.val==next.val){
                next = next.next;
            }
            curr.next = next;
            curr = next;
            if(next!=null) next = next.next;
        }
        return head;
        // =======================Simple ========================
        //  ListNode res = head;
        // while (head != null && head.next != null) {
        //     if (head.val == head.next.val) {
        //         head.next = head.next.next;
        //     } else {
        //         head = head.next;
        //     }
        // }
        // return res;    
        // =======================Brute force====================
        // Set<Integer> list = new TreeSet<>();
        // for (ListNode l1 = head; l1 != null; l1 = l1.next)
        //     list.add(l1.val);
        // ListNode res = null;
        // ListNode tmp = null;
        // for (Integer i : list) {
        //     if (res == null) {
        //         res = new ListNode(i);
        //         tmp = res;
        //     } else {
        //         tmp.next = new ListNode(i);
        //         tmp = tmp.next;
        //     }
        // }
        // return res;
    }
}
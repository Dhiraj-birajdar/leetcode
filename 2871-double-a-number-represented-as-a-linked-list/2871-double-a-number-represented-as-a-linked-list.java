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
import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        String ans = new BigInteger(sb.toString()).multiply(BigInteger.valueOf(2)).toString();
        int i = 0;
        for (temp = head; temp != null; temp = temp.next, i++) {
            temp.val = Integer.parseInt(ans.substring(i, i + 1));
            if (i+1 < ans.length() && temp.next==null) {
                temp.next = new ListNode(Integer.parseInt(ans.substring(++i, i + 1)));
                return head;
            }
        }

        return head;
    }
}
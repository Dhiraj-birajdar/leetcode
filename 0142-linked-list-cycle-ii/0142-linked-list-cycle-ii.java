/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                for(fast=head;slow!=fast;slow=slow.next,fast=fast.next);
                // fast=head;
                // while(slow!=fast){
                //     slow=slow.next;
                //     fast=fast.next;
                // }
                return slow;
            }
        }
        return null;
    }

    //141. Linked List Cycle ignore
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)return true;
        }
        return false;        
    }
}

// Approach (Finding Start of Cycle – Floyd’s Algorithm):
// Use two pointers (slow and fast) to detect a cycle. both pointers start at head, slow moves one step, fast moves two steps.
// If they meet, a cycle exists. To find the start of the cycle, reset one pointer to the head and then move both pointers one step at a time.
// The node where they meet again is the entry point of the cycle.
// If fast reaches null, there is no cycle.
// Time complexity is O(n) and space complexity is O(1).
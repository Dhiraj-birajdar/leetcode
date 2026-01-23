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

    //my solution
    public boolean _hasCycle(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return false;
        ListNode slow = head,fast = head.next.next;
        if(slow==fast) return true;
        while(fast!=null){
            if(slow==fast) return true;
            slow = slow.next;
            if(fast.next==null) return false;
            fast = fast.next.next;
        }
        return false;
    }
}

// Approach (Floyd’s Cycle Detection / Tortoise and Hare):
// Use two pointers starting at the head: slow moves one step at a time, and fast moves two steps.
// If the list has a cycle, the fast pointer will eventually catch up to the slow pointer, and they will meet.
// If the fast pointer reaches null (or fast.next is null), the list has no cycle.
// This works in O(n) time and O(1) extra space.

// Complexity
// Time complexity: O(n)
// Space complexity: O(1)
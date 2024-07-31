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
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow, fast;
        List<Integer> li = new ArrayList<>();
        for(slow=head,fast=head.next.next;fast!=null;slow=slow.next,fast=fast.next.next){
            li.add(slow.val);
        }
        li.add(slow.val);
        slow=slow.next;
        for(int i = li.size()-1;slow!=null;slow=slow.next,i--){
            if(sum<li.get(i)+slow.val)
                sum=li.get(i)+slow.val;
        }
        return sum;
    }
}
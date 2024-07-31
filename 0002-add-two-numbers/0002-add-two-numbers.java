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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       BigInteger sum = BigInteger.ZERO, n1 = BigInteger.ZERO, n2 = BigInteger.ZERO, mul = BigInteger.ONE;

        while (l1 != null) {
            n1 = n1.add(mul.multiply(BigInteger.valueOf(l1.val)));
            mul = mul.multiply( BigInteger.valueOf(10));
            l1 = l1.next;
        }
        mul = BigInteger.ONE;
        while (l2 != null) {
            n2 = n2.add(mul.multiply(BigInteger.valueOf(l2.val)));
            mul = mul.multiply( BigInteger.valueOf(10));
            l2 = l2.next;
        }
        sum = n2.add(n1);
        System.out.println(sum);
        l1 = new ListNode(Integer.parseInt(sum.mod(BigInteger.TEN).toString()),null);
        l2 = l1;
        sum= sum.divide(BigInteger.TEN);
        while (!sum.equals(BigInteger.ZERO)){
            l1.next = new ListNode();
            l1 = l1.next;
            l1.val = Integer.parseInt(sum.mod(BigInteger.TEN).toString());
            sum=sum.divide(BigInteger.TEN);
        }
        return l2;
    }
}
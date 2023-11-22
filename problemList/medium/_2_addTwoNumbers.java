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
    int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        System.out.println(carry);
        int sum = (l1 == null ? 0 : l1.val)
             + (l2 == null ? 0 : l2.val)
             + carry;

        if (l1 == null && l2 == null && carry == 0){
            return null;
        }

        carry = sum/10;

        return new ListNode(sum%10,addTwoNumbers(
            (l1 == null ? l1 : l1.next),
            (l2 == null ? l2 : l2.next)));
    }
}
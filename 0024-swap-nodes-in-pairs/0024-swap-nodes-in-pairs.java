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
    public ListNode swapPairs(ListNode head) {
         ListNode dummy = new ListNode(-1);
         dummy.next=head;

         ListNode prev=dummy;

         while(prev.next!=null && prev.next.next!=null){
            ListNode curr = prev.next;
            ListNode temp = curr.next;

            curr.next=temp.next;
            temp.next=curr;
            prev.next=temp;
            prev=curr;
         }
         return dummy.next;
    }
}
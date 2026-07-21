class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        return fun(head, k);
    }

    public ListNode fun(ListNode head, int k) {

        if (head == null || head.next == null || k == 1)
            return head;

        ListNode st = head;
        ListNode end = head;

        int i = 1;
        while (i <= k) {
            if (end == null)
                return head;
            end = end.next;
            i++;
        }

        ListNode ans = reverse(st, end);

        st.next = fun(end, k);

        return ans;
    }

    public ListNode reverse(ListNode st, ListNode end) {

        ListNode prev = null;
        ListNode curr = st;

        while (curr != end) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }

        return prev;
    }
}
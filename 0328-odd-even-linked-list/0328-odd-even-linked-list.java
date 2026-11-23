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
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode oddHead = new ListNode(0);
        ListNode evenHead = new ListNode(0);

        ListNode oddTail = oddHead;
        ListNode evenTail = evenHead;

        ListNode temp = head;
        int position = 1;

        while (temp != null) {

            if (position % 2 != 0) {
                oddTail.next = new ListNode(temp.val);
                oddTail = oddTail.next;
            } else {
                evenTail.next = new ListNode(temp.val);
                evenTail = evenTail.next;
            }

            temp = temp.next;
            position++;
        }

        
        oddTail.next = evenHead.next;

        return oddHead.next;
    }
}
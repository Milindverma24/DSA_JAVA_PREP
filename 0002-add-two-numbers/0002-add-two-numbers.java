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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int sum =0;
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy ;
        while(t1!=null||t2!=null||carry != 0){

            int val1 = (t1!=null) ? t1.val : 0;
            int val2 = (t2!=null) ? t2.val : 0;
            sum = val1+val2+carry;
            int digit = sum%10;

            
            
            carry = sum/10;
            temp.next = new ListNode(digit);
            temp = temp.next;

            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }


            
        }
        return dummy.next;


    }
}
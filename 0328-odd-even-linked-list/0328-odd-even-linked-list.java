class Solution {
    public ListNode oddEvenList(ListNode head) {

        // If the linked list is empty, return null.
        if (head == null) {
            return null;
        }

        // Dummy node for the even-positioned list.
        ListNode ehead = new ListNode(0);

        // Dummy node for the odd-positioned list.
        ListNode ohead = new ListNode(0);

        // Pointer to traverse the original linked list.
        ListNode temp = head;

        // Pointer to add nodes to the even list.
        ListNode tempe = ehead;

        // Pointer to add nodes to the odd list.
        ListNode tempo = ohead;

        // Start counting positions from 1.
        int number = 1;

        // Traverse the original linked list.
        while (temp != null) {

            // Store the next node before changing links.
            ListNode nextNode = temp.next;

            // Check if the current position is odd.
            if (number % 2 != 0) {

                // Add the current node to the odd list.
                tempo.next = temp;

                // Move the odd pointer forward.
                tempo = tempo.next;

            } else {

                // Add the current node to the even list.
                tempe.next = temp;

                // Move the even pointer forward.
                tempe = tempe.next;
            }

            // Move to the next original node.
            temp = nextNode;

            // Increase the position counter.
            number++;
        }

        // Terminate the even list.
        tempe.next = null;

        // Connect the odd list to the even list.
        tempo.next = ehead.next;

        // Return the odd list, skipping its dummy node.
        return ohead.next;
    }
}
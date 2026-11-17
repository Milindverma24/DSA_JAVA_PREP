package Linked_LIST;

public class addelement_end {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addElementEnd(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, int data) {
        return addElementEnd(head, data);
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = addElementEnd(head, 1);
        head = addElementEnd(head, 4);
        head = addElementEnd(head, 5);
        head = addElementEnd(head, 5);

        System.out.print("List: ");
        printList(head);
        System.out.println();
        System.out.println("Length: " + length(head));
    }
}

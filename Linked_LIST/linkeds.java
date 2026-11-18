package Linked_LIST;

public class linkeds{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
   }
   public static class linkedllist{
        Node head = null;
        Node tail = null;
        void insertend(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next=temp;
                tail = temp;
            }
        }
        void display(){
            Node current = head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
        }
        int size(){
            int count =0;
            Node current = head;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }
   }

   

   public static void main(String[]args){
    linkedllist ll = new linkedllist();
    ll.insertend(10);
    ll.insertend(20);
    ll.insertend(30);
    ll.display();
    System.out.println();
    System.out.println(ll.size());
   }

   
}
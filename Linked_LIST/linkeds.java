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
        void insertatstart(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next=head;
                head=temp;
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

        void insert_at_index(int idx,int data){
            Node t = new Node(data);
            Node temp = head;

            if(idx==size()){
                insertend(data);
                return;
            }
            else if (idx==0){
                insertatstart(data);
                return;
            }

            for(int i =1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;

        }
   }

   

   public static void main(String[]args){
    linkedllist ll = new linkedllist();
    ll.insertatstart(50);
    ll.display();
    System.out.println();

    ll.insertend(10);
    ll.insertend(20);
    ll.insertend(30);
    ll.display();
    System.out.println();

    ll.insertatstart(40);
    ll.display();
    System.out.println();

    System.out.println(ll.size());

    ll.insert_at_index(5, 100);
    ll.display();
    System.out.println();

    
   }

   
}
package Java.LinkedList_DSA;

public class doubleLL {
    class Node{
        int data;
        Node next, prev; 
        Node (){next =null; prev= null;}
        Node(int data ) { this.data = data ; next = null; prev= null;} 
    }
    Node head, tail;
    doubleLL()
    { head = tail= null;}
    void insertFirst(int elem)
    {
        Node newnode = new Node(elem);
        if(head == null )
            head = tail = newnode;
        else
        {
            newnode.next = head;
            head.prev = newnode;
            head= newnode;
        }
    }
    void insertLast(int elem)
    {
        Node newnode = new Node(elem);
        if(head == null )
            head = tail = newnode;
        else
        {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;  
            tail.next= null;
        }

    }
    void deleteBegin()
    {
        if(head == null)
            System.out.println("List is Empty ");
        else  if(head == tail ){
            System.out.println("Deleted = "+head.data);
            head = tail= null;
        }
        else
        {
            System.out.println("Deleted = "+head.data);
            head = head.next;
        }

    }
    void deleteLast()
    {

    }
    void reverse() 
    {

    }
    void print(Node first ) // recursive 
    {
        if(first != null)
        {
            System.out.print(first.data + "  ");
            print(first.next); // recursive call 
        }
        // while(first!= null)
        // {
        //     System.out.println(first.data);
        //     first = first.next;
        // }
    }
    void printReverse_head(Node head ) // recursive 
    {

    }
    void printReverse_Tail(Node tail)
    {

    }
    public static void main(String[] args) {
        doubleLL obj = new doubleLL();
        obj.insertFirst(100);
        obj.insertLast(200);
        obj.insertFirst(300);
        obj.insertLast(400);
        obj.print(obj.head);  
        System.out.println();
        obj.deleteBegin();
        obj.print(obj.head);
    }
}   

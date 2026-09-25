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
            head.prev = null;
        }

    }
    void deleteLast()
    {
        if(head == null)
            System.out.println("List is Empty ");
        else  if(head == tail ){
            System.out.println("Deleted = "+head.data);
            head = tail= null;
        }
        else
        {
            System.out.println("Deleted = " + tail.data);
            // Node temp = tail;
            // temp.prev = null ; 
            tail = tail.prev;
            tail.next= null;
        }
    }
    Node reverse(Node head ) 
    {
        if (head == null)
            return null;
        else
        {
            Node prev = head.prev;  // 1. Null , 
            head.prev = head.next; //     2<-1->2  
            head.next = prev ;  //    2<-1 

            if(head.prev == null)
                return  head; 

            return reverse(head.prev);  // 2 

            // 1 ,2 ,3 
            // head = 1 
            // prev = null 
            // 1.prev = 2 
            // 1.next = null 
            // 2 -> 1 -> null   2<-3  
///////////////////
///         head = 2 
///         prev = 1 
///         2.prev = 3 
///         2.next = 1 
///         3 -> 2 -> 1 
/// /////////////////////
///         head = 3 
///         prev = 2 
///         3.prev = 4 
///         3.next = 2 
        //    4<-3<-2<-1 

        }
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
        if(head != null)
        {
            printReverse_head(head.next);
            System.out.print(head.data+"  ");
        }
    }
    void printReverse_Tail(Node tail)
    {
        if (tail != null)
        {
            System.out.println(tail.data+" ");
            printReverse_Tail(tail.prev);
        }
    }
    public static void main(String[] args) {
        doubleLL obj = new doubleLL();
        // obj.insertFirst(100);
        // obj.insertLast(200);
        // obj.insertFirst(300);
        // obj.insertLast(400);
        // obj.print(obj.head);  
        // System.out.println();

        // obj.printReverse_head(obj.head);
        // System.out.println();
        // obj.printReverse_Tail(obj.tail);
        // System.out.println();

        // obj.deleteBegin();
        // obj.print(obj.head);
        // obj.deleteLast();
        // obj.print(obj.head);
        //////////// reverse 
        obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertFirst(3);
        obj.insertFirst(4);
        obj.insertFirst(5);
        obj.insertFirst(6);
        obj.print(obj.head);
        obj.head = obj.reverse(obj.head);
        obj.print(obj.head);
    }
}   

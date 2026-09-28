package Java.LinkedList_DSA;

public class CircularDoublyLL {
    class Node{
        int data;
        Node next, prev; 
        Node (){next =null; prev= null;}
        Node(int data ) { this.data = data ; next = null; prev= null;} 
    }
    Node head , tail ;
    CircularDoublyLL()
    {
        head = tail = null;
    }
    void insertBegin(int elem)
    {
        Node newnode = new Node(elem);
        if(head == null){
            head = tail = newnode;
            head.prev  = tail;
            tail.next = head ; 
        }
        else
        {   
            newnode.next = head;  // 1<- 2 -> 1 
            newnode.prev = tail;  ///  head.prev  
            head.prev = newnode; 
            tail.next = newnode;
            head = newnode;
        }
    }
    void inserLast(int elem)
    {
        Node newnode = new Node(elem);
        if(head == null){
            head = tail = newnode;
            head.prev  = tail;
            tail.next = head ; 
        }
        else
        {
            newnode.prev = tail;
            newnode.next = head ;
            tail.next = newnode;
            head.prev = newnode;
            tail = newnode;
        }
    }

    void deleteBegin()
    {
        if (head == null)
            System.out.println("List is Empty ");
        else if (head== tail){
            System.out.println("Deleted "+ head.data);
            head = tail = null;
        }
        else{
            System.out.println("Deleted "+ head.data);
            /*
            temp = head.prev;  4 
            head.prev.next= head.next ; // 4->2   // 1 2 3 4 
            head = head.next ;  // head update 2 
            head.prev = temp ;  // 4 <-2
            */

            head = head.next ;
            head.prev = tail ;
            tail.next = head; 
        }
    }
    void deleteEnd()
    {
        if (head == null)
            System.out.println("List is Empty ");
        else if (head== tail){
            System.out.println("Deleted "+ head.data);
            head = tail = null;
        }
        else{
            /*
            // only head pointer   /// 1 2 3 4  

            temp = head.prev.prev; // temp = 3    
            temp.next = head;   // 3-> 1 
            head.prev = temp;
            */
           tail = tail.prev ;
           head.prev = tail;
           tail.next = head ;
        }

    }
    void display()
    {
        Node temp = head;
        while(temp.next!= head )
        {
            System.out.print(temp.data+"\t");
            temp= temp.next;
        }        
        System.out.println(temp.data+"\t");

    }
    public static void main(String[] args) {
        CircularDoublyLL obj = new CircularDoublyLL();
        obj.insertBegin(1);
        obj.insertBegin(2);
        obj.insertBegin(3);
        obj.inserLast(4);
        obj.inserLast(5);
        obj.display();
        obj.deleteBegin();
        obj.display();
        obj.deleteEnd();
        obj.display();
    }   
}

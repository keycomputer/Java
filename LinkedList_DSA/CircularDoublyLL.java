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
    // int countNode(){} 
    void insertatpos(int elem, int pos)
    {
        if (pos <=0 )
            System.out.println("Invalid position ");
        else if (pos == 1 )
            insertBegin(elem);
        else{
            Node temp = head ;
            int c = 1 ;
            Node newnode = new Node(elem);
            while(c < pos-1 && temp.next != head) // valid pos 
            {
                c++;
                temp = temp.next;
            }
            if (c < pos-1 )// (temp.next == head) //
                System.out.println("Invalid Position ");
            else
            {
                newnode.next = temp.next;
                newnode.prev = temp ;
                temp.next.prev = newnode;
                temp.next= newnode;
////////////////// in between 2 and 3 insert 5 
                // 1 2 3 4  // temp - 2, 5.next= 3 , 5.prev = 2 ,  2.next= newnode, 2.3.prev = 5 
                //    5
                // 1 2 3 4 -> 5 // temp 4 , 5.next = 1 , 5.prev= 4,  , 4.1.prev = 5 4.next = 5
            }
        }

    }
    void insertaftervalue(int elem, int value)
    {
        // empty list 
        if(head == null)
            System.out.println("Head is empty ");
        else{
            // find  
            Node temp= head;
            boolean found = false;
            while(temp.next != head)
            {
                if(temp.data == value){
                    found = true;
                    break;
                }
                temp= temp.next;
            }
            if(temp.data == value)  
                found = true;
            // if found 
            if (found)
            {
                Node newnode = new Node(elem);
                newnode.next = temp.next;
                newnode.prev = temp;
                temp.next.prev = newnode;
                temp.next = newnode;

            }
            // else 
            else
                System.out.println("Data not found ");
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
        obj.insertatpos(6, 4);
        obj.display();
        obj.insertaftervalue(7, 4);
        obj.display();
    }   
}

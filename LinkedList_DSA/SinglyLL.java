package Java.LinkedList_DSA;

class LinkedList{
    class Node{
        int data;
        Node next; 
        Node (){next =null;}
        Node(int data ) { this.data = data ; next = null; } 
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    LinkedList(){ this.head = this.tail = null ; this.size = 0 ;}
    void insertfirst(int elem)
    {
        Node newnode = new Node(elem);
        if(this.head == null)
            this.head = this.tail = newnode;
        else{
            newnode.next = this.head ;
            this.head = newnode; 
            this.size++;
        }
    }   
    void insertlast(int elem)
    {
        Node newnode = new Node(elem);
        if (this.head == null)
            this.head = this.tail = newnode;
        else
        {
            this.tail.next = newnode;
            this.tail = newnode;
            this.size++;
            
            
            //Asssuming tail node is not present 
            // Node temp = this.head;
            // while(temp.next != null) // Stop at last node
            // {
            //     temp = temp.next;
            // }
            // temp.next = newnode;

        }
    }
    void insertPos(int elem, int pos)
    {
        // with size instance and tail instance 
        if (pos < 0 || pos > size)
            throw new IndexOutOfBoundsException();
        else if (pos == 1)
            insertfirst(elem);
        else if(pos == size)
            insertlast(elem);
        else
        {
            Node newnode = new Node(elem);
            int i = pos;
            Node temp = this.head;
            while(i>2)
            {
                temp = temp.next;
                i--;
            }
            newnode.next = temp.next ;
            temp.next= newnode;    
        }

        // Assuming without -> size and tail 


    }
    void display()
    {
        Node temp = this.head;
        System.out.println("Data ::  ");
        while(temp != null) 
        {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class SinglyLL {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertfirst(100);
        obj.insertfirst(200);
        obj.insertfirst(300);
        obj.insertlast(400);
        obj.insertPos(500, 2);
        obj.display();
    }
}

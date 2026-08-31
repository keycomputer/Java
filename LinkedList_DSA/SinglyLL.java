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
        if (pos <= 0 || pos > size)
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
             this.size++;  
        }

        // Assuming without -> size and tail 
        // Node newnode = new Node(elem);
        // if (pos <= 0 )
        //     throw new IndexOutOfBoundsException();
        // else if (pos == 1)
        // {
        //     newnode.next= this.head;
        //     this.head = newnode;
        // }
        // else
        // {
        //     int i = 1 ;  // 100-200-300-400  pos , 2  // 3
        //     Node temp = this.head;    
        //     for( ; i<pos-1;i++) // i=1 ; i< 2-1 ;i++ x // i ; i<3-1=2 ;i++ 
        //         temp = temp.next;
        //     newnode.next=temp.next;
        //     temp.next= newnode;   
        // }
    }
    // void insertAfterValue(int elem);
    // void insertMid(int elem);
    // void insertSortedOrder(int elem);
    // void delMide();
    // void deleteValue // afterValue() 
    // reverse 
    // merge 
    // bubblsort 
    // split 
    void deleteFirst()
    {
        // With Size and Tail 
        if (this.head == null) // if(size==0)
            throw new NullPointerException();
        int data = this.head.data;
        if (this.head.next == null) // if (size == 1)
            this.head = this.tail = null;    // line
        else
            this.head = this.head.next;
        System.out.println("Data : "+ data+" deleted ");
        this.size--; // line 
        System.out.println("Updated List : ");
        display();
    }
    void deleteLast()
    {
        // With Size and Tail 
        if (this.head == null) // if(size==0)
            throw new NullPointerException();
        int data = this.head.data;
        if (this.head.next == null) // if (size == 1)
            this.head = this.tail = null;    // line
        else    
        {
            Node temp = this.head;
            while(temp.next.next != null)
                temp = temp.next;
            this.tail = temp;
            this.tail.next= null;
            this.size--;

            // without size and tail
            // Node temp = this.head;
            // while(temp.next.next != null)
            //     temp = temp.next;
            // temp.next= null;

        }
        System.out.println("Data : "+ data+" deleted ");
        System.out.println("Updated List : ");
        display();
    }
    void deletePos(int pos )
    {
        if(pos <=0 || pos > size)
            throw new IndexOutOfBoundsException();
        else if(pos == 1)
            deleteFirst();
        else if(pos == size)
            deleteLast();
        else{
            int i = 1 ;
            Node temp1 = this.head;
            Node temp2 = null;    // 100-200-300-400-500
            while (i < pos  ) { // pos 2 /  i=1 i<= // pos 3 i=1 i<3 
                temp2 = temp1;
                temp1= temp1.next;
                i++;
            }
            int data = temp1.data;
            temp2.next= temp1.next;
            temp1 = null;
            System.out.println("Data : "+ data+" deleted ");
            System.out.println("Updated List : ");
            display();
            this.size--;
        }
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
        obj.deleteFirst();
        obj.deleteLast();
        obj.insertfirst(600);
        obj.insertlast(700);
        obj.display();
        obj.deletePos(3);
    }
}

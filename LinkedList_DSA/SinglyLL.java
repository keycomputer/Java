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
        }
        this.size++;
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
            //Asssuming tail node is not present 
            // Node temp = this.head;
            // while(temp.next != null) // Stop at last node
            // {
            //     temp = temp.next;
            // }
            // temp.next = newnode;

        }
        this.size++;
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
    void insertAfterValue(int elem, int value) throws NullPointerException
    {
        if(this.head == null)
            throw new NullPointerException();
        else if (this.head.next== null && this.head.data == value)
            insertlast(elem);
        // else if(this.head.next!= null  && this.tail.data == value)
        //     insertlast(elem);
        else{
            Node temp = this.head;  
            Node newnode = new Node(elem);
            while(temp != null && temp.data != value)
            {
                temp = temp.next; 
            }
            if(temp == null){
                System.out.println("Data not Found - cannot insert value ");
                return ;
            }
            else // 1 2 3 4 
            {
                newnode.next = temp.next ;
                temp.next = newnode;
                if (temp == this.tail)
                    tail = newnode;
            }
            this.size++;
        }

    }
    void insertMid(int elem)
    {
        // size / 2 
        // insert at pos -> pos 1 ?? pos invalid 
        Node slow = head;
        Node fast = head ;
        Node prev = null;
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Data = " + slow.data);
        Node newnode = new Node(elem);
        newnode.next = slow;
        prev.next= newnode;
        this.size++;
    }

    void insertSortedOrder(int elem)
    {
        Node newnode = new Node(elem);
        if (this.head == null)
            this.head = this.tail = newnode;
        else if (this.head.data > elem) // insert at begin 
        {
            newnode.next= this.head;
            this.head = newnode;
        }        
        else
        {
            Node temp = this.head ;
            while(temp.next != null && temp.next.data < elem )
                temp = temp.next;
            if(temp.next == null)
            {
                this.tail.next =  newnode;
                this.tail = newnode;
            }
            else
            {
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
        this.size++;
    }
    void delMid()
    {
        // size / 2 
        // delete pos 

        Node prev = null;
        Node slow = head ;
        Node fast = head ;

        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next; 
        }
        System.out.println("Data  "+ slow.data +" deleted ");
        prev.next = slow.next; 
        slow = null;
        this.size++;
    }
    void deleteValue(int elem)  
    {
        if (this.head == null)
            throw new NullPointerException();
        else if (this.head.data== elem)
        {
            deleteFirst();
        }
        else
        {
            Node temp = head; 
            while(temp.next != null && temp.next.data != elem)
            {
                temp = temp.next;

            } // 1 2 3 4 5 
            if(temp.next == null)
            {
                System.out.println("Data not found for deletion ");
                return;
            }
            else
            {    // 1 2 3 4
                System.out.println("Data "+ temp.next.data +" deleted ");
                temp.next = temp.next.next; 
                if(temp.next == this.tail)
                    tail = temp;
                this.size--;
            }
        }
    }
    // afterValue()
    // reverse 
    void reverse()
    {
        Node prev = null;
        Node curr = this.head ;
        Node next;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev; 
            prev = curr;
            curr = next ; 
        }
        this.head = prev ;

    }
    void merge(LinkedList obj1 , LinkedList obj2)
    {
        if(obj1.head== null)
            this.head = obj2.head;
        else if(obj2.head == null)
            this.head = obj1.head;
        else
        {
            Node temp1 = obj1.head;
            Node temp2 = obj2.head;
            while(temp1 != null && temp2 != null)
            {

                if (temp1.data < temp2.data)
                {
                    // System.out.println(temp1.data + " "+temp2.data );
                    if(this.head == null)
                        this.head = this.tail = temp1;
                    else{
                        this.tail.next = temp1;
                        this.tail = temp1;
                    }
                    temp1 = temp1.next ;
                }

                else
                {
                    if(this.head == null)
                        this.head = this.tail = temp1;
                    else{
                        this.tail.next = temp1;
                        this.tail = temp1;
                    }
                    temp2 = temp2.next;
                }
            }
            if(temp1 != null)
            {
                this.tail.next = temp1;
                this.tail= obj1.tail;
            }
                        if(temp1 != null)
            {
                this.tail.next = temp1;
                this.tail= obj1.tail;
            }
            this.tail.next= null;
        }
        

    } 
    // bubblsort 
    // split 
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
        obj.insertAfterValue(800, 500);
        obj.display();
        obj.insertAfterValue(900, 700);
        obj.display();
        obj.insertAfterValue(110,  800);
        obj.display();
        obj.insertMid(100);
        obj.display();
        obj.delMid();
        obj.display();
        obj.deleteValue(100);
        obj.display();
        obj.reverse();
        obj.display();
        // 
        System.out.println("Insert in sorted Order ");
        LinkedList obj2 = new LinkedList();
        obj2.insertSortedOrder(20);
        obj2.insertSortedOrder(10);
        obj2.insertSortedOrder(14);
        obj2.insertSortedOrder(17);
        obj2.insertSortedOrder(11);
        obj2.insertSortedOrder(22);
        obj2.display();
        LinkedList obj3 = new LinkedList();
        obj3.insertSortedOrder(2);
        obj3.insertSortedOrder(11);
        obj3.insertSortedOrder(16);
        obj3.insertSortedOrder(9);
        obj3.insertSortedOrder(19);
        obj3.insertSortedOrder(5    );
        obj3.display();
        LinkedList obj4 = new LinkedList();
        obj4.merge(obj2, obj3);
        obj4.display();
    }
}

package Java.LinkedList_DSA;

public class mergeSort {
     class Node{
        int data;
        Node next; 
        Node (){next =null;}
        Node(int data ) { this.data = data ; next = null; } 
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;
    mergeSort(){ this.head = this.tail = null ; this.size = 0 ;}
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
    Node getMiddle(Node head)
    {
        if (head == null)
            return head;
        else
        {
            Node slow, fast;
            fast = slow  = head ;
            while(fast.next != null && fast.next.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
        return slow;
        }
    }

    Node  mergeSortRecur(Node head)
    {
        // base case 
        if(head == null)
            return head ;
        // base case
        else if (head.next == null)
            return head;
        else
        {
            Node middle = getMiddle(head ); // head till middle 
            Node secondLL= middle.next;  // middlenext till null
            middle.next = null; // break 
            
            Node leftLL = mergeSortRecur(head);
            Node rightLL = mergeSortRecur(secondLL); 
            return merge(leftLL, rightLL);
        }
    }    
    Node merge(Node leftLL, Node rightLL)
    {
        Node temp = new Node();   /// start -> act tail 
        Node temp2 = temp;  // memory area share  // act  head 

        while(leftLL != null && rightLL != null)
        {
            if (leftLL.data < rightLL.data)
            {
                temp.next = leftLL;
                leftLL = leftLL.next;
            }
            else{
                temp.next = rightLL;
                rightLL = rightLL.next; 
            }
            temp= temp.next;
        }
        // remaining data 
        if(leftLL != null)
            temp.next = leftLL;
        if (rightLL != null)
            temp.next = rightLL;

        return temp2.next;
    }
    public static void main(String[] args) {
        mergeSort obj = new mergeSort();
        obj.insertlast(100);
        obj.insertlast(90);
        obj.insertlast(150);
        obj.insertlast(800);
        obj.insertlast(40);
        obj.insertlast(80);
        obj.insertlast(110);
        obj.display();
        obj.head =  obj.mergeSortRecur(obj.head) ;
        obj.display();
    }
}
// 100     90      150     800     40      80      110

//  100 - 800      40 to 110 

// 100 90    150 800                 40 80     110 

// 100  90  ||   150   800  || 40    80   ||  110 
// Merge 
// 90 100  ||   150 800   |||||||   40 80   || 110 
// 90  100 150 800  ||||||         40  80 110 

// 40 80 90 100 110 150 800 

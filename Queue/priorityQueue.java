package Java.Queue;

class Node{
    int data ;
    int pr;
    Node next;
    public Node() 
    { }
    public Node (int data, int pr)
    {
        this.data = data ;
        this.pr = pr ;
        next = null;
    }    
}
class pQueue{
    Node front, rear ;
    public pQueue()
    { front = rear = null; } 
    void enqueue(int data , int pr)
    {
        Node newnode = new Node(data,pr);
        if (front == null) // empty queue 
            front= rear = newnode;
        else if(front!=null && front.pr < pr)
        {
            newnode.next = front;
            front = newnode;
        }
        else{
            Node temp = front;  // Current pointer 
            Node temp2 = null ; // previous pointer 
            while(temp != null && temp.pr >= pr){
                temp2 = temp;
                temp = temp.next;
            }
            newnode.next = temp;   // 3.next = 1 
            temp2.next = newnode; // 5.next = 3 
        }
    }
    void dequeue()
    {
        if (front == null)
            System.out.println("Queue is empty "); // throw 
        else
        {
            int elem = front.data;
            int pr = front.pr;
            System.out.println("Deleting "+elem + "Priority "+pr);
            if (front == rear) // one node 
                front = rear = null;
            else
                front = front.next;

        }
    }
}
public class priorityQueue {
    public static void main(String[] args) {
        pQueue p1= new pQueue();
        p1.enqueue(100, 5);
        p1.enqueue(200, 1);
        p1.enqueue(120, 10);
        p1.dequeue();
        p1.dequeue();

    }
}

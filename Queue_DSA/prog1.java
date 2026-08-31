package Java.Queue;

class QueueArray
{
    private int arr[] ;
    private int size;
    private int front , rear ;
    public QueueArray()
    {
        size = 10;
        arr = new int[size];
        front = rear = 0;
    }
    public QueueArray(int size)
    {
        this.size =  size ;
        arr = new int[size];
        front = rear = 0;
    }
    public boolean isFull()
    {
        return (rear == size)? true : false;
    }
    public boolean isEmpty()
    {
        return (front == 0 )? true : false; 
    }
    public void enqueue(int elem)
    {
        if (isFull())
            System.out.println("Queue is Full ");
        else{
            if (front == 0 && rear == 0 ) // adding data -> first time 
                front = rear = 1;
            else 
                rear++;
            arr[rear-1] = elem;
        }
    }
    public int dequeue()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;
        else 
        {
            int elem = arr[front-1];
            if(front == rear ) // single element in an array 
                front = rear = 0; // reset 
            else 
                front++; // front increase by one position 
            return elem;
        }
    }
}

public class prog1 {
    public static void main(String[] args) {
        QueueArray q1 = new QueueArray(5);
        for(int i=1;i<=6;i++)
            q1.enqueue((i));
        
        while(!q1.isEmpty())    
            System.out.println(q1.dequeue());
    }
}

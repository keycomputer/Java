package Java.Stack_LIFO;

class Stack2
{
    private int []arr;
    private int top ;
    private int size;
    public Stack2()
    {
        size= 10;
        arr= new int[size];
        top = 0;
    }
    public Stack2(int size)
    {
        this.size = size; // instance variable  = local member 
        arr = new int[size];
        top = 0;
    }
    int topElem()
    {
        if(isEmpty())
            return Integer.MIN_VALUE;
        else 
            return arr[top-1];
    }
    boolean isEmpty()
    {
        return top == 0 ? true : false;
    }
    boolean isFull()
    {
        return top == size ? true : false; 
    }
    // push - insertion 
    public void push(int data)
    {
        if(isFull())
            System.out.println("OverFlow ");
        else
            arr[top++] = data;
    }

    // pop  - deletion 
    int pop()
    {
        if(isEmpty())
            return Integer.MIN_VALUE;
        else
        {
            int elem = arr[top-1]; // index -> value 
            top--;
            return elem;
        }
    }

}
public class stack1
{
    public static void main(String[] args) {
        Stack2 obj = new Stack2(5);
        obj.push( 100);
        obj.push( 200);
        obj.push( 300);
        obj.push( 400);
        obj.push( 500);
        obj.push( 600);
        // while(!obj.isEmpty())
        //     System.out.println(obj.pop());
        while(true)
        {
            int elem = obj.pop();
            if (elem == Integer.MIN_VALUE){
                System.out.println("Underflow -> STACK is EMPTY ");
                break;
            }
            else
                System.out.println(elem);
        }
    }
}
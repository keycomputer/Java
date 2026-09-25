package Java.LinkedList_DSA;

public class Practice {
    // total node using recursion 
    static int countNode(Node head )
    {
        if(head == null)
            return 0;
        return (1 + countNode(head.next));
    }
    static boolean detectCycle(Node head)
    {
        Node fast, slow ;
        fast = slow = head ;
        while(fast != null && fast.next != null)
        {
            // 1 2 3 4 5 
            fast= fast.next.next ;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
    ///////////////////////////////////////////////
    /// reverse -> n1 till n2 
    /// reverse -> k group 
    /// // palindrome ///
    
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertfirst(10);
        obj.insertlast(20);
        obj.insertlast(30);
        obj.insertlast(40);
        obj.insertlast(50);
        obj.display();
        System.out.println("Total Nodes = "+ countNode(obj.head));
        System.out.println("has Cycle " + detectCycle(obj.head));
        // to check detectCycle() method we can create a cycle in linked list by connecting last node to any node in the list
        LinkedList obj1 = new LinkedList();
        obj1.insertfirst(10);
        obj1.insertlast(20);    
        obj1.head.next.next = obj1.head; // creating a cycle by connecting last node to head
        System.out.println("has Cycle " + detectCycle(obj1.head));
    }
}

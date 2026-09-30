package Java.LinkedList_DSA;

import java.util.HashSet;

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
    /// reverse -> K groups 
    // 1 2 3 4 5 6 7 8 
    static Node reverseK(Node head, int k)
    {
        if (head == null)
            return head;
        else if (head.next == null )
            return head;
        else 
        {
            Node next;
            Node prev = head;  // 1-> 
            Node cur = head.next; // 2->
            for(int i=0; i<=k-2 && cur!= null; i++)
            {
                next = cur.next; // 3->   // 4
                cur.next = prev;  //2 -> 1  //3->2->1
                prev = cur; // 2->1  // 3->2->1
                cur = next;  // 3    // 4 
            }   
            // recursion 
            Node next2 = reverseK(cur, k); //3->2->1   4, 5,6,
            head.next= next2;  // 1->6
            return prev; 
        }
    }

    /// // palindrome ///
    // 1 2 3 1 2 3 

    // 1 2 3 3 2 1 
    static boolean isPalindrome (Node head)
    {
        Node slow , fast , next , prev ;
        slow = fast  = head;
        // Mid Point 
        while(fast !=null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next;
        }
        System.out.println("Middle "+slow.data);
        // reverse 
        prev = slow; // mid data  // 
        slow = slow.next ; 
        prev.next = null;

        while(slow != null)
        {
            next = slow.next;
            slow.next = prev;
            prev = slow ;
            slow = next;
        }
        slow = prev ;

        ///////////////////////////////
        next = head ;
        while(slow != null)
        {
            if (next.data != slow.data)
                return false;
            slow= slow.next;
            next = next.next; 
        }
        return true;
    }    
    /// remove duplicates 
    /// Sorted 
    // 1 1 1 1 1 1
    static Node removeduplicatesorted(Node head)
    {
        if(head == null){
            System.out.println("List is empty");
            return head;
        }
        else
        {
            Node temp= head;
            while(temp!= null)
            {
                Node nexttemp = temp.next;
                if(temp.data == nexttemp.data)
                {
                    while(temp.data == nexttemp.data && nexttemp != null)
                    {
                        temp.next = nexttemp.next; // remove 
                        nexttemp = nexttemp.next;
                    }
                }
                temp= temp.next;
            }
            return head;
        }
    }

    /// unsorted 
    /// 1 3 1 4 2 1 5 2  
    /// output  1 3 4 2 5 
    
    static Node removeduplicateunsorted(Node head)
    {
        if(head == null)
        {
            System.out.println("List is empty ");
            return head;
        }
        HashSet<Integer> obj = new HashSet<>();
        Node temp = head;
        obj.add(temp.data);  // 1 
        while(temp != null)
        {
            Node nexttemp = temp.next; 
            while(nexttemp != null && obj.contains(nexttemp.data)) // (3 in set - No )
            {
                // remove 
                temp.next = nexttemp .next;  // 3-> 4
                nexttemp = nexttemp.next;
            }

            if(nexttemp != null )
                obj.add(temp.data);
            temp = nexttemp;
        }
        return head;
    }
    //////////////////////////////////////////////////
    /// intersection point (L1 or L2 )
    //////////////////////////////////////////////////
    /// 
    /// 
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

        obj.head  = reverseK(obj.head, 3);
        obj.display();
        LinkedList obj2 = new LinkedList();
        obj2.insertlast(1);
        obj2.insertlast(2);
        obj2.insertlast(2);
        obj2.insertlast(1);
        obj2.display();
        System.out.println(isPalindrome(obj2.head));

        LinkedList obj3 = new LinkedList();
        obj3.insertlast(1);
        obj3.insertlast(2);
        obj3.insertlast(2   );
        obj3.insertlast(2   );
        obj3.display();
        obj3.head = removeduplicatesorted(obj3.head);
        obj3.display();
        
    }
}

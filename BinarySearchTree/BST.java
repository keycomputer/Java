
class Node{
    int data;
    Node left , right;
    Node(){
        left = right= null;
    }
    Node (int data)
    {
        this.data=  data;
        left = right= null;
    }
}
public class BST{
    private Node root;

    BST(){
        this.root = null;
    }
    void insert (int key)
    {
        Node newnode = new Node(key);
        if (root == null) 
        {
            root = newnode;
        }
        else
        {
            Node temp1, temp2; // temp1 current , temo2 parent 
            temp1 = root;
            temp2 = null;
            while(temp1 != null)
            {
                temp2=  temp1; // store parent 
                if(key < temp1.data)
                {
                    temp1 = temp1.left; 
                }
                else
                {
                    temp1 = temp1.right;  
                }
                /*
                else if (key < temp1.data)
                {
                    temp1 = temp1.right;  
                }
                else
                    return 
                */
            }
            // temp2 -> parent 
            if (temp2.data > key )
                temp2.left = newnode;
            else
                temp2.right = newnode;
        }
    }
    void inorder(Node root )
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    void preorder(Node root )
    {
        if (root != null)
        {
            System.out.println(root.data);
            
            preorder(root.left);
            preorder(root.right);
        }
    }
    int getSucc(Node root)
    {
        while(root.left.left != null)
            root = root.left;
        return root.left.data;
    }
    public Node deletion(Node root , int key)
    {
        // Search 
        if (root == null)
            return null;
        else if (key < root.data)
            root.left = deletion(root.left, key);
        else if (key > root.data)
            root.right= deletion(root.right , key );
        else
        {
            // if leaf Node or left is empty 
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            
            root.data = getSucc(root.right);
            root.right = deletion(root.right, root.data); // update key value with successor 
        }
        return root; 
    }
    
    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(100);
        obj.insert(50);
        obj.insert(60);
        obj.insert(40);
        obj.insert(70);
        obj.insert(20);
        obj.insert(10);
        obj.inorder(obj.root);
        obj.deletion(obj.root, 40);
        obj.inorder(obj.root);
        

    }
}
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class checkBST{
    static Node prev=null;
    public boolean BSTcheck(Node root)
    {
        if(root!=null)
        {
            if(!BSTcheck(root.left))
            {
                return false;
            }
            if(prev!=null && prev.data>=root.data)
            {
                return false;
            }
            prev=root;
            return BSTcheck(root.right);
        }
        return true;
    }
    public void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(" "+root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        checkBST t1=new checkBST();
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);
        System.out.println("Tree: ");
        t1.inorder(root);
        System.out.println();
        System.out.println(" is given tree BST :"+t1.BSTcheck(root));
    }
}
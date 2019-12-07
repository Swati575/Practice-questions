import java.util.Scanner;
class Leafnodes
{
static Node root;
static class Node
{
int data;
Node left;
Node right;
	Node()
	{
	left=right=null;
	}
	Node(int data)
	{
	this.data=data;
	}

}
Leafnodes()
    {
        root=null;
    }
Leafnodes(int data)
    {
        root=new Node(data);
    }
public static Node insert(Node root,int data)
{
	if(root==null)
	{
	Node temp=new Node(data);
	return temp;
	}
		if(data<root.data)
		{
		root.left=insert(root.left,data);	
		}
		else if(data>root.data)
		{
		root.right=insert(root.right,data);
		}
return root;
}
	public static void Leaf(Node root)
	{
	if(root==null)
	return;
	if(root.right==null && root.left==null)
	System.out.println(root.data+" ");
	Leaf(root.left);
	Leaf(root.right);
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Leafnodes bst=new Leafnodes(12);
       bst.insert(bst.root, 15);
        bst.insert(bst.root, 5);
        bst.insert(bst.root, 9);
        bst.insert(bst.root, 1);
        bst.insert(bst.root, 3);
        bst.insert(bst.root, 20);
bst.Leaf(bst.root);
}
}
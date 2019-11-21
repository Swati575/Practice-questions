import java.util.Scanner;

class LinkedList 
{
static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next = null;
        }
    }


public static LinkedList insert(int data,LinkedList li)
    {
        Node newNode = new Node(data);
        if(li.head==null)
        {
           li.head =  newNode;
           // return;
        }
else
{
        Node temp = li.head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
	temp.next = newNode;
}
return li;
    }
void rotate(int data,int k,LinkedList li)
{
	Node temp=li.head;
	Node current=li.head;
	int count=1;
	while(count<k)
	{
		temp=temp.next;
		count++;
	}
	Node keynode=temp;
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=head;
	head=keynode.next;
	keynode.next=null;
	
}
	
void display(LinkedList li)
    {
        Node temp = head;
	 while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Rotate
 {
 public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();

        LinkedList li = new LinkedList();
         System.out.println("Enter the elements of linked list");
int x=0;
         while(n-- > 0)
        {
            x = sc.nextInt();
            li.insert(x,li);
        }
System.out.println("Enter the value of key");
int key=sc.nextInt();
li.rotate(x,key,li);
li.display(li);
}
}
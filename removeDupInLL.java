import java.util.Scanner;

class LinkedList 
{
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

    Node head = null;

    void insert(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head =  newNode;
            return;
        }
        Node curr = head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }

        curr.next = newNode;
    }

    void removeDuplicates()
    {
        Node curr = head;
        while(curr!=null && curr.next!=null)
        {
            Node curr1 = curr;

            while(curr1.next!=null)
            {
                if(curr.data == curr1.next.data)
                {
                    curr1.next = curr1.next.next;
                }
                else
                    curr1=curr1.next;
            }

            curr=curr.next;
        }
    }

    void printList()
    {
        Node curr = head;

        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
public class removeDupInLL {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList li = new LinkedList();

        while(n-- > 0)
        {
            int x = sc.nextInt();
            li.insert(x);
        }
        
        li.printList();

        li.removeDuplicates();

        li.printList();

       // li.close();
    }
}

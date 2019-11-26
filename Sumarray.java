import java.util.Scanner;
class Sumarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,sum=0;
System.out.println("Enter Size of array1: ");
n1=sc.nextInt();
System.out.println("Enter Size of array2: ");
n2=sc.nextInt();
int ar[]=new int[n1];
int arr[]=new int[n2];
System.out.println("Enter elements of array1 :");
for(int i=0;i<n1;i++)
{
ar[i]=sc.nextInt();
}
System.out.println("Enter elements of array2 :");
for(int i=0;i<n2;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter value of sum ");
sum=sc.nextInt();
for(int i=0;i<n1;i++)
{
for(int j=0;j<n2;j++)
{
if(ar[i]+arr[j]==sum)
System.out.println(ar[i]+" "+arr[j]);

}
}
}
}
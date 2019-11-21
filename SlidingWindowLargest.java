import java.util.Scanner;
 class SlidingWindowLargest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter key");
int k=sc.nextInt();
for(int i=0;i<=n-k;i++)
{
int max=arr[0];
for(int j=i;j<k+i;j++)
{
if(arr[j]>max)
{
max=arr[j];
}
}
System.out.print(max+" ");
}
}
}
import java.util.Scanner;
class Subarray1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,k;
n=sc.nextInt();
int arr[]=new int[n];
k=sc.nextInt();
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int sum=0,c=0;
for(i=0;i<n;i++)
{
if(arr[i]<=k)
{
c++;
}
else
{
sum+=(c*(c+1))/2;
c=0;
}
}
System.out.println( n*(n+1)/2-sum);
}
}
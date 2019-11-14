import java.util.*;
 class Asg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,k;
n=sc.nextInt();
int arr[]=new int[n];
for( i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
k=sc.nextInt();
for( i=0;i<n;i++)
{
int sum=0;
for(int j=i;j<n;j++)
{
sum=sum+arr[j];
if(sum>k)
break;
if(sum==k)
{
System.out.println("Starting index : "+i+"Ending index : "+j);
break;
}
}
}
return;
}
}


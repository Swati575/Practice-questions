import java.util.*;
class SecondLargest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size;
size=sc.nextInt();
int arr[]=new int [size];
	for(int i=0;i<size;i++)
	{
	arr[i]=sc.nextInt();
	}
int max=arr[0];
int k=0;
	for(int i=0;i<size;i++)
	{
		if(arr[i]>max)
		{
		k=i;
		max=arr[i];
		}
	}
System.out.println( max);

arr[k]=-9899;
max=arr[0];
for(int i=0;i<size;i++)
	{
		if(arr[i]>max)
		{
		max=arr[i];
		}
	}

System.out.print( max);
}
}


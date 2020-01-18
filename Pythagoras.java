import java.util.*;
class Pythagoras
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	
		int testcase,size,f=0;
		System.out.println("Enter number of test cases ");
		testcase=sc.nextInt();
		System.out.println("Enter size of array ");
		size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements of array ");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
		for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
					{
						for(int k=0;k<size;k++)
							{
								if(arr[i]*arr[i] + arr[j]*arr[j]== arr[k]*arr[k])
								{
								f=1;
								}
							}
					}
			}
if(f==1)
System.out.println("YES");
else
System.out.println("NO");
	}

}
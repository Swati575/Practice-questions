import java.util.Scanner;
class Duplicate
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n,i;
	System.out.println("ENTER THE SIZE OF ARRAY");
	n=s.nextInt();
	int a[]=new int[n];
	int count[]=new int[100];
	System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
System.out.println("OUTPUT");
	for( i=0;i<n;i++)
	{
	count[a[i]]++;
	}
for( i=0;i<n;i++)
	{
	if(count[a[i]]>=1)
	{
System.out.println("element : " + a[i] + "frequency : "+count[a[i]]);
	count[a[i]]=-1;
	
	}
	}

}
}
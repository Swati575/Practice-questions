import java.util.*;
//Reversing a string without reversing any special character
class Stringg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1;
s1=sc.next();
char arr[]=s1.toCharArray();
int n=s1.length()-1;
int var=0;
	 for(int i=n;i>=0;i--)
	{
		if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122)
		{
			var++;
			System.out.println(arr[i]);
		}
		else
		{
		System.out.println(arr[var]);
		var++;
		}
	}
}
}


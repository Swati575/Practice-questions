import java.util.*;
class Anagram
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,j,f=0;
	String s1=sc.next();
	String s2=sc.next();
	char ch1[]=s1.toCharArray();
	char ch2[]=s2.toCharArray();
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	if(ch1.length==ch2.length)
	{
		for(i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
			{
			f=1;
			}
		}
	}
	else
	{
		f=0;
	}
		if(f==1)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
			
}
}
	
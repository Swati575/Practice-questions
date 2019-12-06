
import  java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
    int a,i,c=0,d,e=0;
    a=sc.nextInt();
    for(i=1;i<a;i++) 
	if(a%i==0)
    {
    for(d=2;d<i;d++) 
if(i%d==0) e++;
    if(e==0)
 c=i;
    e=0;
    }
   System.out.println(c);
}
}
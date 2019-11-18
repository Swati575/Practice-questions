import java.util.*;
public class LongestStringPalindrome {

	public static void main(String[] args)
 	{
                Scanner sc=new Scanner(System.in);
	String str=sc.next();
	LPS(str);
	}

	static public String intermediatePalindrome(String s, int left, int right)
	 {
		if (left > right) return null;
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}
	public static String LPS(String s) 
	{
		if (s == null) 
		return null;
		String l = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) 
			{
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > l.length())
			 {
				l= palindrome;
			}
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > l.length())
			 {
				l = palindrome;
			}
		}
		return l;
	}

}
package worksheet;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		StringBuilder org=new StringBuilder(scan.next());
		StringBuilder rev =new StringBuilder();
		
		int l=org.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev.append(org.charAt(i));
		}
		if(String.valueOf(org).compareTo(String.valueOf(rev))==0)
			
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}

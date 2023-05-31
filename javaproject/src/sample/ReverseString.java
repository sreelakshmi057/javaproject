package sample;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String org=scan.next();
		String rev=" ";
		int l=org.length();
		
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
	
        System.out.println("Reversed string:"+rev);
	}

}

package sample;

import java.util.*;

public class PalStringExample {

	public static void main(String[] args) {
		String org,rev="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		org=scan.nextLine();
		
		int length=org.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
        if(org.contentEquals(rev))
        {
        	System.out.println("Is palindrome");
        }
        else
        {
        	System.out.println("Not palindrome");
        }
	}

}

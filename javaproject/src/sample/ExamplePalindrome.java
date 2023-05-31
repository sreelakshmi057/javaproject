package sample;

public class ExamplePalindrome {

	public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("java");
		StringBuilder s3=s1;
		StringBuilder rev=s1.reverse();
		StringBuilder s2=new StringBuilder("malayalam");
		StringBuilder s4=s2;
		StringBuilder reverse=s2.reverse();
		if(s3==s1||s4==s2)
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	
	

	}

}

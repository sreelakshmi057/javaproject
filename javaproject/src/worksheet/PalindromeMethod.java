package worksheet;

public class PalindromeMethod {
	static int n1=1331;
	public static void main(String[] args)
	{   
	   
		int rev=reverse(n1);
		palindrome(rev);

	}
	public static int reverse(int n)
	{   int rev=0;
		while(n>0)
		{
			rev=(rev*10)+n%10;            //1 12 121
			n=n/10;		                  //12 1
		}
		System.out.println("Reverse="+rev);
	    return rev;
	   
		}
	public static void palindrome(int p)
	{   
		
		if(n1==p)
		{
			System.out.println("No is palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
		
	}

}

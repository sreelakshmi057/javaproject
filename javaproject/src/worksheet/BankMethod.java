package worksheet;
import java.util.*;
public class BankMethod 
{   static int amt=50000;
	public static void main(String[] args)
    {   
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter deposit amount");
		int a=scan.nextInt();
		deposit(a);
		System.out.println("Enter withdrawal amount");
		int b=scan.nextInt();
		withdrawal(b);			
	}
	public static void deposit(int a)
	{   
		amt=a+amt; 
		System.out.println("Balance after deposit:"+amt);
	}
	public static void withdrawal(int b)
	{   check(b);
	    boolean isEligible=check(b);
		if(isEligible==true)
		{
		System.out.println("Successfully processed");
		amt=amt-b;
		System.out.println("Available balance:"+amt);
		}
		else
		{
		System.out.println("Insufficient balance");
		}
	}
		public static boolean check(int c)
		{
			if(amt>c)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
	}
	
		
	
			
	



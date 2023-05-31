package worksheet;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args)  
	{
		Scanner value=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=value.nextInt();
        int org=num;
        int rev=0;
        while(num>0)
        {
        	
        	rev=(rev*10)+num%10;
        	num=num/10;
        	
        }
       
        System.out.println("Reverse Number="+rev);
	
if(rev==org)
{System.out.println("Number is Palindrome");
	}
else
{
	System.out.println("Number is not Palindrome");
	}
}
}

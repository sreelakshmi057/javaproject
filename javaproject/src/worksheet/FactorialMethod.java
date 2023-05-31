package worksheet;
import java.util.*;

public class FactorialMethod {

	public static void main(String[] args) 
	{
		factorial();
		
	}
	public static void factorial()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
	    int n=scan.nextInt();
	    int fact=1;
		
		for(int i=1;i<=n;i++)               //1 2 3 4 5
		{ 
			fact=fact*i;                    //1 2 6 24 120
		}
		
		System.out.println("Factorial of given number is:"+fact);
	}

}

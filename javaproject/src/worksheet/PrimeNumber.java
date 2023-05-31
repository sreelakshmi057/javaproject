package worksheet;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner value=new Scanner (System.in);
		System.out.println("Enter a Number:");
		int num=value.nextInt();
		int count=0;
		if(num>1)
		{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count=count+1;		
			}
		}
		if(count==2)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
		}
	}
}

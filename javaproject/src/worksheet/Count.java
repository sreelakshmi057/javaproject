package worksheet;
import java.util.*;
public class Count {

	public static void main(String[] args) 
	{
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Limits");
		int lmt1=value.nextInt();
		int lmt2=value.nextInt();
		int e=0;
		int d=0;
		for(int i=lmt1;i<=lmt2;i++)
		{
			if(i%2==0)
			{
				e=e+1;
				
			}
			else
			{
				d=d+1;
				
			}
		
		}
		System.out.println("Even number count="+e);
		System.out.println("Odd number count="+d);
	}

}

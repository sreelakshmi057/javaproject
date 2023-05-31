package sample;
import java.util.*;

public class Choice {

	public static void main(String[] args ) {
		Scanner scan=new Scanner(System.in);
		char v;
		
		do
		{
			System.out.println("Enter choice");
			int ch=scan.nextInt();
			
			switch (ch)
		{
	
		case 1:
			System.out.println("enter number");
			int n=scan.nextInt();
			if(n%2==0)
			{
			System.out.println("Even number");
			}
			else
			{
				System.out.println("odd Number");
			}
			break;
		case 2:
			System.out.println("Enter Limit");
			int l=scan.nextInt();
			for(int i=1;i<=l;i++)
			{
				System.out.println(i);;
			}
		
	         break;
		}
System.out.println("Do you want to continue?");
v=scan.next().charAt(0);
		}
		while(v=='y'||v=='Y');
	}

}

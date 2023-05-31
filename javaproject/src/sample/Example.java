package sample;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char c;
		do
		{
			System.out.println("Enter Choice");
			int ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Number");
				int n=scan.nextInt();
				if(n%2==0)
				{
					System.out.println("Even Number");
				}
				else
				{
					System.out.println("Odd Number");
				}
			case 2:
				System.out.println("Enter Limit");
				int lmt=scan.nextInt();
				for(int i=1;i<=lmt;i++)
				{
					System.out.println(i);
				}	
			}
			System.out.println("Do You want to continue?");
			 c=scan.next().charAt(0);
		}
		while(c=='Y'||c=='y');

	}

}

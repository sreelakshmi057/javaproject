package worksheet;
import java.util.*;
public class DiscountMethod {
    static int total;
	public static void main(String[] args)
	{   
		Scanner scan=new Scanner (System.in);
	    System.out.println("Enter prices:");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    int c=scan.nextInt();
		int amt=price(a,b,c);
		discount(amt);
		
	}
	public static int price(int a,int b,int c)
	{
		int total=a+b+c;
		return total;
	}
	public static void discount(int b)
	{
		if(b>5000)
		{
			System.out.println("Eligible for 20% discount");
			b=(b*20)/100;
			System.out.println("Discount amount:"+b);
		}
		else
			System.out.println("Visit next time");
	}
}

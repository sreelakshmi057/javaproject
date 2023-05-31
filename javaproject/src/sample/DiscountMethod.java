package sample;
import java.util.*;
public class DiscountMethod {
    
    static int sum=0;
	public static void main(String[] args)
	{   
		Scanner scan=new Scanner (System.in);
	    System.out.println("Enter limit:");
	    int l=scan.nextInt();
	    int[] a=new int[l];
	    System.out.println("Enter No's");
	    
        for(int i=0;i<l;i++)
       {
	    a[i]=scan.nextInt();
	   }
	    
		int amt=price(a);
		discount(amt);
		
	}
	public static int price(int a[])
	{   
		
        for(int i=0;i<a.length;i++)
       {
    	   sum=a[i]+sum;
    	  
       }
		
		return sum;
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

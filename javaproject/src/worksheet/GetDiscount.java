package worksheet;
import java.util.*;
public class GetDiscount extends ClothParent{
       
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("1:onseason");
		System.out.println("2:offseason");
		System.out.println("Enter option");
		int season=sc.nextInt();
		System.out.println("Enter amount:");
	    amount=sc.nextInt();
		
		ClothParent c;
		
		if(season==1)
		{	
		    c=new OnSeason();
			c.season();
		}
		else
		{
			c=new OffSeason();
			c.season();
	     
		}
	}

}

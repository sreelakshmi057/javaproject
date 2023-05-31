package worksheet;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter Limit");
		int l=num.nextInt();
		int x=0,y=1,z;
		System.out.print(x+" "+y);
		for(int i=1;i<=l;i++)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}		
		
	}

}

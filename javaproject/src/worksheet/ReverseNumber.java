package worksheet;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=value.nextInt();
		int rev=0;
		
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
		}
		System.out.println("Reverse="+rev);	
	}

}

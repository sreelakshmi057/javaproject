package worksheet;
import java.util.*;
public class Largest {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter num a=");
		int a=value.nextInt();
		System.out.println("Enter num b=");
		int b=value.nextInt();
		System.out.println("Enter num c=");
		int c=value.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("Greatest="+a);
		}
		else if(b>a&&b>c)
		{
			System.out.println("Greatest="+b);
		}	
		else
		{
			System.out.println("Greatest="+c);
		}
	}

}

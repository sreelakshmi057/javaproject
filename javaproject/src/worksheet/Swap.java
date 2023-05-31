package worksheet;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=num.nextInt();
		int b=num.nextInt();
		System.out.println("Number before swap="+a);
		System.out.println("Number before swap="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number after swap="+a);
		
		System.out.println("Number after swap="+b);
	}

}

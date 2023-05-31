package worksheet;
import java.util.*;
public class SwappingTemporary {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=num.nextInt();
		int b=num.nextInt();
		System.out.println("Number before swap a="+a);
		System.out.println("Number before swap b="+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("Number after swap a="+a);
		System.out.println("Number after swap b="+b);

		
		
	}

}

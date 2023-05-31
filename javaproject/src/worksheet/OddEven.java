package worksheet;
import java.util.*;
public class OddEven {

	public static void main(String[] args) {
	Scanner value=new Scanner(System.in);
	System.out.println("Enter number");
	int num=value.nextInt();
	if(num%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}

	}

}

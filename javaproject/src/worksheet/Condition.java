package worksheet;
import java.util.*;
public class Condition {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a=value.nextInt();
		if(a>0){
			System.out.println("Number is positive");
		}
		else
			System.out.println("Number is negative");
	}

}

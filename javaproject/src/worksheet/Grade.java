package worksheet;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);
		
		System.out.println("Enter marks");
		double marks=value.nextDouble();
		if(marks>=81)
		{
			System.out.println("Grade A");
		}
		else if(marks>=71)
		{
			System.out.println("Grade B");
		}
		else if(marks>=61)
		{
			System.out.println("Grade C");
		}
		else if(marks>=40)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade Failed");
		}
	}

}

package worksheet;
import java.util.*;
public class DrivingLicense {

	public static void main(String[] args) {
		Scanner range=new Scanner(System.in);
		System.out.println("Enter age");
		int age=range.nextInt();
		if(age>18)
		{System.out.println("Eligible for driving licenese");
			
		}
		else{
			System.out.println("Not eligible for driving license");
		}		
		

	}

}

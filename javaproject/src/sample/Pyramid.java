package sample;
import java.util.*;
public class Pyramid {

	public static void main(String[] args) 
	{
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Limit");
		int lmt=value.nextInt();
		for(int i=1;i<=lmt;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}

package sample;

import java.util.*;

public class CountOddEven {

	public static void main(String[] args) 
		{
			Scanner value=new Scanner(System.in);
			System.out.println("Enter Limit");
			int lmt=value.nextInt();
			int e=0;
			int d=0;
			for(int i=1;i<=lmt;i++)
			{
				if(i%2==0)
				{
					e=e+1;
					
				}
				else
				{
					d=d+1;
					
				}
			
			}
			System.out.println("Even number count="+e);
			System.out.println("Odd number count="+d);

	}

}

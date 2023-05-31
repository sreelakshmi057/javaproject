package worksheet;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
	//Area of triangle

			Scanner value=new Scanner(System.in);
			System.out.println("Enter Breadth and Height");
			int b=value.nextInt();
			int h=value.nextInt();
			int area=(b*h)/2;
			System.out.println("Area of Traingle="+area);
//Name and Age
			
			    Scanner read=new Scanner(System.in);
				System.out.println("Enter Name");
				String name=read.nextLine();
				System.out.println("Enter Age");
				int a=read.nextInt();
				System.out.println("Name="+name);
				System.out.println("Age="+a);
			//Addition integer
				
				Scanner range=new Scanner(System.in);
				System.out.println("Enter Numbers");
				int e=range.nextInt();
				int f=range.nextInt();
				int sum=e+f;
				System.out.println("Sum="+sum);
					//Addition integer and float number
				
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter Numbers");
				int m=obj.nextInt();
				float n=obj.nextFloat();
				float result=m+n;
				System.out.println("Sum="+result);
	}

}

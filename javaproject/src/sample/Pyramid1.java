package sample;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) 
	{
		Scanner value=new Scanner(System.in);
		System.out.println("Enter Limit");
		int lmt=value.nextInt();
		for(int i=lmt;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	}



package worksheet;
import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int r,c;
	System.out.println("Enter no of rows");
	 r=scan.nextInt();
	System.out.println("Enter no of Coloumns");
	 c=scan.nextInt();
	int A[][]=new int[r][c];
	int B[][]=new int[r][c];
	int C[][]=new int[r][c];
	
	System.out.println("Enter elements of 1st matrix=");
          for(int i=0;i<2;i++)
	  {
	      for(int j=0;j<2;j++)
		{
			 A[i][j]=scan.nextInt();
		}
	  }
          System.out.println("Enter elements of 2nd matrix=");
	      for(int i=0;i<2;i++)
	  {
	     for(int j=0;j<2;j++)
		{
			 B[i][j]=scan.nextInt();
		}
	  }
	      System.out.println("Sum of two matrix=");     
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			 C[i][j]=A[i][j]+B[i][j];	 
		}
	}
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
	System.out.print(C[i][j]+" ");
			}
			System.out.println();
	}
	}
}

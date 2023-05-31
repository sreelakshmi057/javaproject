package worksheet;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the limit");
		int l=scan.nextInt();
		int sum=0;
		int []a=new int[l];
		System.out.println("Enter elements");
		
		for(int i=0;i<a.length;i++)
		{
		
			a[i]=scan.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);

	}

}

package worksheet;
import java.util.*;
public class ElementArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int e;
		System.out.println("Enter the search element:");
		e=scan.nextInt();
		int A[]={10,20,30,40,5,6,9};
		boolean flag=false;
		for(int i=0;i<A.length;i++)
		{
			
			if(e==A[i])
			{
				System.out.println("Element found at:"+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
			{
			System.out.println("Element not found");
			}

	}

}

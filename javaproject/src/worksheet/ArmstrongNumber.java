package worksheet;

import java.util.*;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num =scan.nextInt();
        int digits=0;
        int sum=0;
        int last=0;
        int temp=num;
        
        while(temp>0)
        	{
        	temp=temp/10;
        	digits++;
        	}
        temp=num;
        
        while(temp>0)
        {
        	last=temp%10;
        	temp=temp/10;
        	sum=(int) (sum+Math.pow(last, digits));
        }
        if(sum==num)
        {
        	
        	System.out.println("No is armstrong");
        }
        else
        {
        	System.out.println("not armstrong");
        }
        	}

}

package worksheet;

import java.util.*;

public class HDFC implements Irbi
{    
	 static float balance;
	 public void recurringDeposit()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount to deposit");
        balance=sc.nextFloat();
        float interest=(rate*years*balance)/100;
        System.out.println("Interest for the amount received is "+interest);
    }
}

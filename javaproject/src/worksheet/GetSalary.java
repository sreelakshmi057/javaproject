package worksheet;
import java.util.*;
public class GetSalary{
        static int payment;
	    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1: Payment for Contract Employee/Hour");
		System.out.println("2: Payment for Fulltime Employee/Hour");
		System.out.println("Enter choice");
        int choice=sc.nextInt();  
        System.out.println("Enter payment=");
        int payment=sc.nextInt();
        
        if(choice==1)
        {
        Employee e=new ContractEmployee();
        e.calculateSalary(payment);
        }
        else{
        Employee e=new FullTimeEmployee();
        e.calculateSalary(payment);
        }
	}

}

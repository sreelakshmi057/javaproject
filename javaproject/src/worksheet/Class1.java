package worksheet;
import java.util.*;
public class Class1 extends Class2 {
	 int basicpay;
	 int deduction;
	 int bonus;
	
	public static void main(String[] args) 
	{
		Class1 obj=new Class1();
		obj.salaryCalculation();
	}
	private  void salaryCalculation() {
		Scanner read=new Scanner(System.in);
	    System.out.println("Enter basic");
	    basicpay=read.nextInt();
	    System.out.println("Enter bonus");
	    deduction=read.nextInt();
	    System.out.println("Enter deduction");
	    bonus=read.nextInt();
	    int hra=hra(basicpay);
	    int pf=pf(basicpay);
	    total(basicpay,hra,bonus,pf,deduction);
	}
	

}

package worksheet;

public class Class3 
{
	public void total(int basicpay,int hra,int bonus,int pf,int deduction)
	{   
		
		int totalsalary=(basicpay+hra+bonus-pf-deduction);
        System.out.println("Salary Slip:-"+" "+"Basic pay="+basicpay+" "+"HRA="+hra+" "+"PF="+pf+" "+"Bonus="+bonus+" "+"Deduction="+deduction +" "+"Total salary inhand"+" "+totalsalary);
		
	}
	
	
}

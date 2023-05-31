package worksheet;

public class ContractEmployee extends Employee {
	
       public void calculateSalary(int payment)
       {
    	   int salary=hours*payment;
    	   System.out.println("Salary for ContractEmployee="+salary);
	   }
}

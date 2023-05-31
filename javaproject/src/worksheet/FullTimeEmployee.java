package worksheet;

public class FullTimeEmployee extends Employee{

	public void calculateSalary(int pay)
    {
		int salary=hours*pay;
		System.out.println("Salary for FulltimeEmployee="+salary);
    }
}

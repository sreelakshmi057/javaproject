package worksheet;

public class FactorialMethod1 {
        int fact=1;
		
	public static void main(String[] args)
	{
		FactorialMethod1 obj=new FactorialMethod1();
		obj.factorial(5);
            
	}
	public  void factorial(int n)
	{
		
		for(int i=1;i<=n;i++)              
		{ 
			fact=fact*i;                   
		}
		display();
		
	}
	public void display()
	{   
		
		System.out.println("Factorial of given number is:"+fact);
	}
}

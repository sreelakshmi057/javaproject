package worksheet;

public class AdditionDivisible extends AddditionSuper {

	public void division()
	{
		int sum=super.add(9,1); //return value result from additionsuper class is stored in a variable int sum and next condition is checked or 
 //or in additionsuper class dont return value just call method super.add(1,2),the result willbe passed,if return is given then assign the returned value to a variable in the class where returned value is required
		
		if(sum%10==0)
		{
			System.out.println("no is divisible by 10");
		}
		else
		{
			System.out.println("not divisible");
		}
	}
	public static void main(String[] args) 
	{  
		AdditionDivisible obj=new AdditionDivisible();
		obj.division();
	}
	

}

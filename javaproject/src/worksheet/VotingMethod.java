package worksheet;

public class VotingMethod {
	
	
	public static void main(String[] args) 
	{
		
		boolean isEligible=eligibility(5);
		if(isEligible==true)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		
	}
	public static boolean eligibility(int age)
	{
		
		if(age>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

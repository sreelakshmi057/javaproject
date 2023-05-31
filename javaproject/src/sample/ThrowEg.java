package sample;

public class ThrowEg {

	public static void main(String[] args) {
		try {
			check(15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	static void check(int age) throws InvalidAgeException
	{
		checkEligibility(age);
	}
	private static void checkEligibility(int age) throws InvalidAgeException {
		if(age<18)
		{
			throw new InvalidAgeException("not eligible for voting");
		}
		
	}

}

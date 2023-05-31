package worksheet;

public class AverageIntegerMethod {

	public static void main(String[] args)
{
		average(10,10,10);
		average(10.3f,10.5f,10.2f);
			
}
	public static void average(int a,int b,int c)
	{
		int sum=a+b+c;
		int avg=sum/3;	
		System.out.println(avg);
	}
	public static void average(float a,float b,float c)
	{
		float sum=a+b+c;
		float avg=sum/3;
		System.out.println(avg);
	}
	
	
	
	
	
}

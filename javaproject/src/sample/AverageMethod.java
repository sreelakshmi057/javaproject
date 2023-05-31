package sample;

public class AverageMethod {

	public static void main(String[] args) {
	int sum=add(10,10);
	avg(sum);
}
public static int add(int a,int b)
{
	int sum=a+b;
	System.out.println("sum="+sum);
	return sum;
}
public static void avg(int addition)
{
	 int average=addition/2;
	System.out.println(average);
	
}
	
	
	
	
	
	
}

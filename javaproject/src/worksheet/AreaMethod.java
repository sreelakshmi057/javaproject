package worksheet;

public class AreaMethod {

	public static void main(String[] args) 
	{
		area(5.659d);
		area(2.5f,6.3f);
		area(9.8f);

	}
	public static void area(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of circle="+area);
	}
	public static void area(float a,float b)
	{
		float area=a*b;
		System.out.println("Area of rectangle="+area);
	}
	public static void area(float a)
	{
		float area=a*a;
		System.out.println("Area of square="+area);
	}
}

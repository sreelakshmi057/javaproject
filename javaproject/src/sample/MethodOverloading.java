package sample;

public class MethodOverloading {

	public static void main(String[] args) 
	{
          add(10,20);
          add(5.4f,2.3f,1.2f);
          
	}
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void add(float a,float b,float c)
	{
		float d=a+b+c;
		System.out.println(d);
	}

}





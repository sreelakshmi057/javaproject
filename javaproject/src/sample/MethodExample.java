package sample;

public class MethodExample {

	public static void main(String[] args) 
	{   int a1=10;   //only if passing a1 and b1
	    int b1=40;   //only if passing a1 and b1
		add();
		add(a1,b1);// or add(10,40)
		}
		
		public static void add()
		{
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("Result="+c);
		}
		public static void add(int a, int b)  
		{
			int c=a+b;
			System.out.println("Result="+c);
		}

	

}

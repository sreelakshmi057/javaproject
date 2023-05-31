package sample;

public class ExceptionEg {
	public static void main(String[] args) {
    int a=20;
    try
    {
    	a=20/0;         //  a=20/5;      given then try and finally  will execute,20/0 catch and finally will execute
    	System.out.println("try block execute");
    }
   catch(ArithmeticException e)//catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
    {
    	a=20/2;
    	System.out.println("catch block execute");
    } //catch(Exception e)to handle any error,catch(ArrayIndexOutOfBoundsException e)eg formultiple exception-sop(e.getMessage())
     finally                     //will always execute
    {
    	System.out.println("finally block execute");
    }
}
}
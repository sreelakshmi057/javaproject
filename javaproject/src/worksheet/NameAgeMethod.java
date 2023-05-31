package worksheet;

public class NameAgeMethod 
{
	static String text;
	static int a;

	public static void main(String[] args) 
	{
		personaldetails();
		getdetails();	
	}
	public static void personaldetails()
	{
		 text = "Akhil";
		 a=22;
		 
	}
	public static void getdetails()
	{   personaldetails();
		System.out.println("Name:"+text);
		System.out.println("Age:"+a);
		
	}
	
}

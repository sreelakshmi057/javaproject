package sample;

public class DisplayInterface implements Interface1,Interface2
{
	public void display()
	{
		System.out.println("Example of Multiple Interface");
		System.out.println("Two interface parentclass inherited using implements seperated by commas");
	}

	public static void main(String[] args) 
	{
		DisplayInterface ref=new DisplayInterface ();
		ref.display();

	}

}

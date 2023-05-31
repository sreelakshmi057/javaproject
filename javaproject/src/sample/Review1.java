package sample;

public class Review1 extends Review{
	void getName() 
	{   super.getName();
		System.out.println("This is childclass");
	}
  public static void main(String[] args) {
	  Review1 obj=new Review1();
	  obj.getName();
}
}

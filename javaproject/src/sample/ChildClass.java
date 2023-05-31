package sample;

public class ChildClass extends ParentClass {
	int childId;
    int childNmae; 
	public static void main(String[] args) 
	{
		ChildClass child=new ChildClass();
		child.display1();

	}
	public void display2()
    {   
    	System.out.println("Details child");
    }
 
}

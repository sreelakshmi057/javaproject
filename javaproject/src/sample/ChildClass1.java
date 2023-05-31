package sample;

public class ChildClass1 extends ParentClass1 {
	int childId;
	int childName;
	public static void main(String[] args) 
	{
		ChildClass1 child=new ChildClass1();
		child.parentMethod();
    }
	public void childMethod()
	{
		System.out.println("child method");
	}

}

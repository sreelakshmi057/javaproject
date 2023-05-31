package sample;

public class ParentClass extends GrandParentClass{
	int grandparentId;
    int granparentNmae;
	public static void main(String[] args)
	{
		ParentClass parent=new ParentClass();
        parent.display();
	
	}
	 public void display1()
	    {   
	    	System.out.println("Details parent");
	    }
     
}

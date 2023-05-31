package worksheet;

public class AreaConstructor {
	AreaConstructor(double r)
	{       double area=3.14*r*r;
            System.out.println("Area of circle="+area);
	}
	AreaConstructor(float a,float b)
	{		float area=a*b;
			System.out.println("Area of rectangle="+area);
	}		
	AreaConstructor(float a)
	{		float area=a*a;
			System.out.println("Area of square="+area);
	}	
	
	public static void main(String[] args) 
		{
		    AreaConstructor obj=new AreaConstructor(5.445d);
		    AreaConstructor value=new AreaConstructor(2.5f,5.6f);
		    AreaConstructor range=new AreaConstructor(5.8f);
		}
		

	}



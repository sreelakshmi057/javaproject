package worksheet;
import java.util.*;
public class ChooseArea {
  
	 ChooseArea(double r)
	 {  
		double area=3.14*r*r;
		System.out.println("Area of circle="+area);
	 }
	 ChooseArea(float l,float b)
	 {   
		float area=l*b;
		System.out.println("Area of rectangle="+area);
	 }
	 ChooseArea(float s)
	 {   
		float area=s*s;
		System.out.println("Area of square="+area);
	 }
		public static void main(String[] args)
		{   Scanner read=new Scanner(System.in);
		    System.out.println("Enter choice a: b: c:");
		    char ch=read.next().charAt(0);
		    Scanner value=new Scanner(System.in);
			switch(ch)
					{ case 'a':
						
					    System.out.println("Enter radius");
					    double r=value.nextDouble(); 
						ChooseArea obj=new ChooseArea(r);
						
					  case 'b':
						System.out.println("Enter length and breadth");
						float l=value.nextFloat();
						float b=value.nextFloat();  
					    ChooseArea ob=new ChooseArea(l,b);
					    
					  case 'c': 
						System.out.println("Enter side");
					    float s=value.nextFloat();
						ChooseArea o=new ChooseArea(s);
			            break;
					}
		}
}
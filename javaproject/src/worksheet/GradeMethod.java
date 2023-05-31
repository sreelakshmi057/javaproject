package worksheet;
import java.util.*;
public class GradeMethod {
     static float sum;
     GradeMethod(int m1,float m2,int m3)
     {     
        	  sum=m1+m2+m3; 	  
	 }
     GradeMethod(float s1,int s2,int s3)
     {  
 	        sum=s1+s2+s3;  
  	 }
     public static void main(String[] args)
     { 
    	     Scanner sc=new Scanner(System.in);
    		 System.out.println("Enter marks of sub1 sub2 sub3 of student1");
    		 int m1=sc.nextInt();
    		 float m2=sc.nextFloat();
    		 int m3=sc.nextInt();  
        GradeMethod grade=new GradeMethod(m1,m2,m3);    //constructor call
        calculateGrade();    
         
        System.out.println("Enter marks of sub1 sub2 sub3 of student 2");
		 float s1=sc.nextFloat();
		 int s2=sc.nextInt();
		 int s3=sc.nextInt();                             //method created  
        GradeMethod mark=new GradeMethod(s1,s2,s3);   
        calculateGrade1();
     }
	private static void calculateGrade()
	{
	  float p=(sum*100)/300;
  	  System.out.println("Total marks:"+sum);
  	 
  	  if(p>89)
  	  {
  		  System.out.println("A");
  	  }
  	  else if(p>79)
  	  {
  		  System.out.println("B"); 
  	  }
  	  else if(p>69)  
  	  {
  		  System.out.println("C");
  	  }
  	  else if(p>59)
  	  {
  		  System.out.println("D");
  	  }
  	  else
  	  {
  		  System.out.println("Fail");
  	  }
	}
	private static void calculateGrade1()
	{
		float p=(sum*100)/300;
  	  System.out.println("Total marks:"+sum);
  	 
  	  if(p>89)
  	  {
  		  System.out.println("A");
  	  }
  	  else if(p>79)
  	  {
  		  System.out.println("B"); 
  	  }
  	  else if(p>69)  
  	  {
  		  System.out.println("C");
  	  }
  	  else if(p>59)
  	  {
  		  System.out.println("D");
  	  }
  	  else
  	  {
  		  System.out.println("Fail");
  	  }
	}
	
}

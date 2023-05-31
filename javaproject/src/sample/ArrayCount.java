package sample;

public class ArrayCount {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
 int oddcount=0;
 int evencount=0;
 for(int i=0;i<a.length;i++)
 {
	 if(a[i]%2==0)
	 {
		 evencount++;
	 }
		 
	 else
	 {
		 oddcount++;
     }
	 
 }
 System.out.println("Total even No="+evencount);
 System.out.println("Total odd No="+oddcount);
 
	}

}

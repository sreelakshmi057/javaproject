package sample;

public class BankObject {

	public static void main(String[] args) {
		ParentBank b=new SBI();   //parent class= new childclass: upcasting
		b.getInterest();
		
		ParentBank ob=new ICICI();
		ob.getInterest();
		
		

	}

}

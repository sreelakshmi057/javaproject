package worksheet;

public class Bank {

	private int pin;

	   public int getpin()
	    {
		return pin;
		}
	   public void setpin(int pin)
	    {
		 if(pin==1001||pin==1234||pin==1212)
		 {
		 this.pin=pin;
		 System.out.println("Valid pin");
		 }
		 else
		 {
			 System.out.println("Reset pin");
		 }
	    }
}

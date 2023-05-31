package sample;

public class BankApplication {

	public static void main(String[] args) {
		BankAbstract b=new SBIAbstract();
        b.getInterestRate();
        b=new ICICIAbstract();
        b.getInterestRate();
	}

}

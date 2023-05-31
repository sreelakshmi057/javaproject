package worksheet;

public class ReverseThis {
	int rev=0;
	int num;                 //instance variable
	ReverseThis(int num)       //arg pass variable name sane as inst variable "num"
	{   
		this();                //calling constructor  to display finding reverse first as in question
		this.num=num;          //using this to assign arg passed num value to go into inst variable num
		while(num>0)
	{
		rev=(rev*10)+num%10;
		num=num/10;
	}
		System.out.println("Finding Reverse: Reverse="+rev);
	}
	 ReverseThis()
	{ 
		System.out.println("Finding Reverse:");
	}

	public static void main(String[] args) 
	{
		ReverseThis obj=new ReverseThis(564);

	}

}

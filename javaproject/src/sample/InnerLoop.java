package sample;

public class InnerLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			for(int j=1;j<=10;j++)
			{
				System.out.println("result="+j);
			}
		}

	}

}

package sample;

public class ArrayPrint {

	public static void main(String[] args) {
		int a[][]={{2,3,4},{5,6,7}};
		for(int i=0;i<2;i++) //0 1 2
		{
			for(int j=0;j<=2;j++)//012 012 012
			{
			System.out.print(a[i][j]);//a[0][0] a[0][1] a[0][2]
			                          //a[1][0] a[1][1] a[1][2]
				
			}
			System.out.println();
		}
		

	}

}

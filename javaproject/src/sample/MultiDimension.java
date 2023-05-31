package sample;

public class MultiDimension {

	public static void main(String[] args) {
		int [][]a={{1,2},{3,4}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}

package javaprogramsforinterview;

public class Multidimensionalarray {

	public static void main(String[] args) {
	
		int a[][]={{2,4,5},{3,4,7}};
		
		
		for (int i=0;i<2;i++) //row
		{
			for (int j=0;j<3;j++) //column
			{
				System.out.println(a[i][j]);
			}
		}
		
	}

}

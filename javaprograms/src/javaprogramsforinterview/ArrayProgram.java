package javaprogramsforinterview;

public class ArrayProgram {

	public static void main(String[] args) {
		// A container stores multiple values of same data type
		
		//How to declares an array and allocate memory 
		
		int a[]= new int[5];
		a[0]=2;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		a[4]=10;
		
		int b[]={2,3,4,5,8}; // Single dimmensition array 
		
		for (int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		

	}

}

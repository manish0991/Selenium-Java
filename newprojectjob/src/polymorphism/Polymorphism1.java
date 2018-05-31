package polymorphism;

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method overloading  or run time binding 
		
    // To call below method I creae obje of the class 
		// https://www.youtube.com/watch?v=ci6902thsQk
		
		Polymorphism1 obj1= new Polymorphism1();
		obj1.add(33, 44);
		obj1.add(2, 4, 6);
		
		//compile type binding because we know which objec is calling 
	}
	
	//order of argument 
   public void add(int a, double b){
		
		double sum = a+b;  // internal type casting or upcasting higher data type
		
		System.out.println("Sum of number is "+sum);
	}

	public void add(int a, int b){
		
		int c = a+b;
		System.out.println("Sum of number is "+c);
	}
	
   public void add(int a, int b, int d){
		
		int c = a+b;
		System.out.println("Sum of number is "+c);
	}
	
}

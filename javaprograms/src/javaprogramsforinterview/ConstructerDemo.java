package javaprogramsforinterview;

public class ConstructerDemo {

	
	public ConstructerDemo() {
       System.out.println("I am constructer");		
	}
	// not accept return type 
	// have same name as class 
	//when we create object construcer automatically called 
	
	
	public void getdata(){
		System.out.println("I am a method");
	}
	
	public static void main(String[] args){
		
	
	ConstructerDemo con=new ConstructerDemo();
	}
	
}

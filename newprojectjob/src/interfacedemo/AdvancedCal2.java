package interfacedemo;

public class AdvancedCal2 implements Calc {
	
	public static void main (String[] args) {
		
		Calc obj1= new AdvancedCal2();
		obj1.add();
		//obj1.calcos();
		//obj1.calsin();
		obj1.sub();
	}

	
	public void calsin()
	{
		System.out.println("I am in adv");
	}
	
	public void calcos()
	{
		System.out.println("I am in add calcos ");
	}
	
	
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("I am in cals interface ");
		
		
	}


	public void sub() {
		
		System.out.println("I am in cals interface ");
	}

}

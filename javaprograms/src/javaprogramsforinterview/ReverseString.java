package javaprogramsforinterview;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Madam"; // Parlodrome program
		String t="";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			//System.out.println(s.charAt(i));
			t=t+s.charAt(i);
			
			
		}
		
		System.out.println(t);
		

	}

}

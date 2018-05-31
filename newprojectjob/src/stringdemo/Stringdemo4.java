package stringdemo;

public class Stringdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fullname="Selenium-HP-QTP-Jmeter";
		String []toolname=fullname.split("-");
				
		for (int i=0;i<toolname.length;i++)
		{
			//System.out.println(toolname[i]);
			System.out.println("Value of "+i+" is "+toolname[i]);
		}
		
	}

}

// https://www.youtube.com/watch?v=Ruuytdl_F4U&t=317s
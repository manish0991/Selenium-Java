package datadriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {

@Test(dataProvider ="getData")
public void dataGenration(String username, String password, String ID)
{
	System.out.println("This method get data from getData method");
	System.out.println(username);
	System.out.println(password);
	System.out.println(ID);
}

@DataProvider 
public Object [][] getData()
{
	Object [][] data= new Object [3][3];
	data [0][0]= "1abcd";
	data [0][1]= "2defg";
	data [0][2]= "3afg";
	
	data [1][0]= "jkm";
	data [1][1]= "kkf";
	data [1][2]= "aedr";
	
	data [2][0]= "abcd";
	data [2][1]= "defg";
	data [2][2]= "afg";
	 return data;
	 	
	}
@Test
@Parameters({"adminUserID"})
public void adminlogin(String AdminID){
	
	System.out.println(AdminID);
	
}
}
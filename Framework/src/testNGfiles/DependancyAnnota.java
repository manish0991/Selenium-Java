
package testNGfiles;

import org.testng.annotations.Test;

public class DependancyAnnota {

	

	@Test
	public void OpeningBrowser()
	{
	
	System.out.println("Executing Test 2");

}
	
@Test(dependsOnMethods={"OpeningBrowser"}, alwaysRun=true)
public void FlightBooking()
{
	System.out.println("Executing Test 1");
}

@Test(enabled= false)
public void Payment()
{

System.out.println("New TestCase");
}

@Test(timeOut=5000)
public void timeRelated()
{

System.out.println("Time Out");
}

}
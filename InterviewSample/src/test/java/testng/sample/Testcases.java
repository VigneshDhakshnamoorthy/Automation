package testng.sample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(testng.sample.ListenerTest.class)
public class Testcases {

	@Test  
	public void testtopass()  
	{  
	Assert.assertTrue(true);  
	}  
	@Test  
	public void testtofail()  
	{  
	Assert.assertFalse(false);  
	}  
}

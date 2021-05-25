package testng.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestcasesTest {

  @Test
  public void testtofailTest() {
		Assert.assertTrue(true);    
		
  }

  @Test
  public void testtopassTest() {
	  Assert.assertFalse(false);  
  }
}

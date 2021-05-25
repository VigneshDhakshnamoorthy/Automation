package testng.sample;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.sample.ListenerTest.class)
public class TestcasesTest {

  @Test
  public void testtofailTest() {
		Assert.assertTrue(true);    
		
  }

  @Test
  public void testtopassTest() {
		Assert.assertTrue(false);    
  }
}

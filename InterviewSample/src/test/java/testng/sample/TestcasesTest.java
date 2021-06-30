package testng.sample;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestcasesTest {
	
	@Parameters({"success"})
	@Test(groups = {"success"}, priority=1)
	public void testtopassTest1(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"success"})
	@Test(groups = {"success"}, priority=1)
	public void testtopassTest2(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"success"})
	@Test(groups = {"success"}, priority=1)
	public void testtopassTest3(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	

	@Test(groups = {"success"}, dataProvider ="dp_name", priority=2)
	public void testtopassTest4(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"Fail"})
	@Test(groups = {"Fail"}, priority=3)
	public void testtofailTest1(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(false);   
	}
	
	@Parameters({"Fail"})
	@Test(groups = {"Fail"}, priority=3)
	public void testtofailTest2(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(false);    
	}
	
	@DataProvider(name = "dp_name")
	public Object[][] dataprofunc(){
		return new Object[][]{
          	{"DP_1"},{"DP_2"}
    	};
		
	}
}

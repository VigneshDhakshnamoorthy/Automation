package testng.sample;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestcasesTest {
	
	@Parameters({"success"})
	@Test(groups = {"success"})
	public void testtopassTest1(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"success"})
	@Test(groups = {"success"})
	public void testtopassTest2(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"success"})
	@Test(groups = {"success"})
	public void testtopassTest3(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"success"})
	@Test(groups = {"success"})
	public void testtopassTest4(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(true);    
	}
	
	@Parameters({"Fail"})
	@Test(groups = {"Fail"})
	public void testtofailTest1(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(false);   
	}
	
	@Parameters({"Fail"})
	@Test(groups = {"Fail"})
	public void testtofailTest2(String name) {
		System.out.println(name+" - "+ Thread.currentThread().getId());
		Assert.assertTrue(false);    
	}
}

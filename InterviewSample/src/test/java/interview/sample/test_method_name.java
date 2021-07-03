package interview.sample;

import org.testng.annotations.Test;

public class test_method_name {
	
	@Test
	public void test1() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

	}
	@Test
	public void test3() {
		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

	}

}

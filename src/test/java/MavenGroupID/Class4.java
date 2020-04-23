package MavenGroupID;

import org.testng.annotations.Test;

public class Class4 {
	@Test (groups= {"odd"})
	public void method1()
	{
		System.out.println("m1");
	}
	@Test
	public void method2()
	{
		System.out.println("m2");
	}
	@Test(groups= {"odd"})
	public void method3()
	{
		System.out.println("m3");
	}
	@Test
	public void method4()
	{
		System.out.println("m4");
	}
	
}

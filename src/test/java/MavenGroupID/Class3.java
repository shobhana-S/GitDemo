package MavenGroupID;


import org.testng.annotations.Test;

public class Class3 {
	
	@Test(groups= {"odd"})
	public void method5()
	{
		System.out.println("m5");
	}
	
	@Test
	public void method6()
	{
		System.out.println("m6");
	}
	
	
}

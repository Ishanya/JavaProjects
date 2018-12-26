package testing;

import org.junit.Before;
import org.junit.Test;

public class TestCaseOne {

	@Test
	public void HappyDay()
	{
		System.out.println("Hello! this is a new day");
	}
	
	@Before
	public void before()
	{
		System.out.println("new test before");
	}
	
}

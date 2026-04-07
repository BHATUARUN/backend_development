package automationjava.testng;

import org.testng.annotations.Test;

public class testng2 {
	
	
	@Test (priority = 1)
	public void Test1 ()
	{
		System.out.println("Arun");
	}
    @Test (priority = 3)
    public void Test2()
    { 
        System.out.println("virendra");
    }
    @Test (priority = 2)
    public void Test3()
    {
    	System.out.println("satish");
    }
}
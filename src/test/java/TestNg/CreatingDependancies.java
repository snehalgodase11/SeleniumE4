package TestNg;

import org.testng.annotations.Test;

public class CreatingDependancies {
	//this we cwn use to fail the test cases
	@Test
	public void CreateAccount() throws InterruptedException
	
	{
		System.out.println("Create Account");
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "CreateAccount",priority = 0)
public void ModifyAccount()
	
	{
		System.out.println("Modify Account");
	}
	
	@Test(dependsOnMethods = "CreateAccount",priority = 1)
public void DeleteAccount()

{
	System.out.println("Delete Account");
}
	
	
	
	
	

}

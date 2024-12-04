package Basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTestNg {
	@Parameters({"browser","username","password","url"})
	@Test
	public void main(String  browser,String usename,String password,String url)
	
	{
		System.out.println(browser);
		System.out.println(usename);
		System.out.println(password);
		System.out.println(url);
		
	}

}

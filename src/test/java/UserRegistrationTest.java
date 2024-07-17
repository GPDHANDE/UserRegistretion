import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import Org.UserRegistration.UserRegistration;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;

public class UserRegistrationTest 
{
	@Test
	public void ValidateFirstName()
	{
		boolean result = UserRegistration.FirstName("Gaurav");
		Assert.assertTrue(result);
	}
	@Test
	public void ValidateLastName()
	{
		boolean result = UserRegistration.LastName("Dhande");
		Assert.assertTrue(result);
	}
	
//	 @Parameters
//	    public static List<Object> data()
//	 {
//	        return Arrays.asList(new Object[]
//	        		{
//	        			"nitish.prjapati@gmail.com",
//	        	        "harshal.gotarne@gmail.com",
//	                });
//	 } 
	@Test
	public void ValidateEmail()
	{
		boolean result = UserRegistration.Email("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}
	@Test
	public void ValidateMobileNo()
	{
		boolean result = UserRegistration.MobileNumber("91 7977139767");
		Assert.assertTrue("HAPPY", result);
	}
	@Test
	public void ValidatePassword()
	{
		boolean result = UserRegistration.PassWord("Gaurav@123");
		Assert.assertTrue(result);
	}
	
	

	public static void main(String[] args) 
	{
		
	}

}

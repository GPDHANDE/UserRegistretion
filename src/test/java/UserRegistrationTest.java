import org.junit.Assert;
import org.junit.Test;

import Org.UserRegistration.UserRegistration;


public class UserRegistrationTest 
{
	@Test
	public void ValidateFirstName()
	{
		String result = UserRegistration.FirstName("Gaurav");
		Assert.assertEquals("HAPPY", result);
	}
	@Test
	public void ValidateLastName()
	{
		String result = UserRegistration.LastName("Dhande");
		Assert.assertEquals("HAPPY", result);
	}
	@Test
	public void ValidateEmail()
	{
		String result = UserRegistration.Email("abc.xyz@bl.co.in");
		Assert.assertEquals("HAPPY", result);
	}
	@Test
	public void ValidateMobileNo()
	{
		String result = UserRegistration.MobileNumber("91 7977139767");
		Assert.assertEquals("HAPPY", result);
	}
	@Test
	public void ValidatePassword()
	{
		String result = UserRegistration.PassWord("Gaurav@123");
		Assert.assertEquals("HAPPY", result);
	}
	
	

	public static void main(String[] args) 
	{
		
	}

}

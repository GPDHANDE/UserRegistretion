import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Org.UserRegistration.UserCustomException;
import Org.UserRegistration.UserRegistration;


public class UserRegistrationTest 
{
	@Test
	public void ValidateFirstName()
	{
		try
		{
			Assertions.assertEquals(true,UserRegistration.FirstName("Gaurav"));
		}
		catch(UserCustomException e)
		{
			fail("This exception should not be thrown");
		}
		
	}
	@Test
	public void InValidFirstName()
	{
		try
		{
			UserRegistration.FirstName("gaurav");
			fail("Expected Custom Exception");
		}
		catch(UserCustomException e)
		{
			Assertions.assertEquals("Invalid first name",e.getMessage());
		}
		
	}
//	@Test
//	public void invalidFirstNameTest()
//	{
//		try
//		{
//			boolean result = UserRegistration.FirstName("gaurav");
//			Assertions.assertTrue(result);
//		}
//		
//	}
	
	@Test
	public void ValidateLastName()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.LastName("Dhande"));
		}
		catch(UserCustomException e)
		{
			fail("This exception should not be thrown");
		}
		
	}
	
	@Test
	public void InValidLastName()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.LastName("dhande"));
		}
		catch(UserCustomException e)
		{
			Assertions.assertEquals("Invalid last name",e.getMessage());
		}
		
	}

	@Test
	public void ValidateEmail()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.Email("gp.dhande12@gmail.com"));
		}
		catch(UserCustomException e)
		{
			Assertions.fail("Exception should not have been thrown");
		}
		
		
	}
	@Test
	public void InValidEmail()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.Email("gpdhande12gmail.com"));
		}
		catch(UserCustomException e)
		{
			Assertions.assertEquals("Invalid email",e.getMessage());		
		}
		
		
	}
	@Test
	public void ValidateMobileNo()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.MobileNumber("91 7977139767"));
		}
		catch(UserCustomException e)
		{
			Assertions.fail("Exception should not have been thrown");
		}
		
		
	}
	
	@Test
	public void InValidMobileNo()
	{
		try
		{
			Assertions.assertTrue(UserRegistration.MobileNumber("917977139767"));
		}
		catch(UserCustomException e)
		{
			Assertions.assertEquals("Invalid mobile number",e.getMessage());
		}
		
		
	}
	
	@Test
	public void ValidatePassword()
	{
		try
		{
			boolean result = UserRegistration.PassWord("Gaurav@123");
			Assertions.assertTrue(result);
		}
		catch(UserCustomException e)
		{
			Assertions.fail("Exception should not have been thrown");
		}
		
	}
	@Test
	public void InValidPassword()
	{
		try
		{
			boolean result = UserRegistration.PassWord("gaurav123");
			Assertions.assertTrue(result);
		}
		catch(UserCustomException e)
		{
			Assertions.assertEquals("Invalid password",e.getMessage());
		}
		
	}
//	@Test
//	public void ValidatePassword()
//	{
//		boolean result = UserRegistration.PassWord("Gaurav@123");
//		Assertions.assertTrue(result);
//	}
//	
	

	public static void main(String[] args) 
	{
		
	}

}

import java.util.Arrays;
import java.util.Collection;
import java.util.List;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Org.UserRegistration.UserRegistration;


public class UserRegistrationTest 
{
	@Test
	public void ValidateFirstName()
	{
		boolean result = UserRegistration.FirstName("Gaurav");
		Assertions.assertTrue(result);
	}
	@Test
	public void ValidateLastName()
	{
		boolean result = UserRegistration.LastName("Dhande");
		Assertions.assertTrue(result);
	}
	
	@ParameterizedTest
	@ValueSource(strings ={
			"gp.dhande12@gmail.com",
            "nitish.prjapati@gmail.com",
            "harshal.gotarne@gmail.com",
            "amruta.shinde@gmail.com",
            "anjali.patil@gmail.com",
            
    })
	
	public void ValidateEmail(String email)
	{
		boolean result = UserRegistration.Email(email);
		Assertions.assertTrue(result);
	}
	@Test
	public void ValidateMobileNo()
	{
		boolean result = UserRegistration.MobileNumber("91 7977139767");
		Assertions.assertTrue(result);
	}
	@Test
	public void ValidatePassword()
	{
		boolean result = UserRegistration.PassWord("Gaurav@123");
		Assertions.assertTrue(result);
	}
	
	

	public static void main(String[] args) 
	{
		
	}

}

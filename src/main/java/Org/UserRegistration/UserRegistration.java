package Org.UserRegistration;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	private static final String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
	private static final String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
	private static final String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
	private static final String mobilePattern = "^\\d{2} \\d{10}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	
	
	public static boolean validate(String name, String pattern)
	{
		Pattern compiledPattern1 = Pattern.compile(pattern);
		Matcher matcher1 = compiledPattern1.matcher(name);
		return matcher1.matches();
	}
	
	public static boolean FirstName(String fname) throws UserCustomException
	{
		Predicate<String> validateFirstName = name -> validate(name,firstNamePattern);
		if(validateFirstName.test(fname))
		{
			return true;
		}
		else
		{
			throw new UserCustomException("Invalid first name");
		}
	}
	
	public static boolean LastName(String lname) throws UserCustomException
	{
		Predicate<String> validateLastName = name -> validate(name,lastNamePattern);
		if(validateLastName.test(lname))
		{
			return true;
		}
		else
		{
			throw new UserCustomException("Invalid last name");
		}		
	}
	
	public static boolean Email(String email) throws UserCustomException
	{
		Predicate<String> validateEmail = name -> validate(email,emailPattern);
		if(validateEmail.test(email))
		{
			return true;
		}
		else
		{
			throw new UserCustomException("Invalid email");
		}
	}
	
	public static boolean MobileNumber(String mobileNo) throws UserCustomException
	{
		Predicate<String> validateMobileno = no -> validate(no,mobilePattern);
		if(validateMobileno.test(mobileNo))
		{
			return true;
		}
		else
		{
			throw new UserCustomException("Invalid mobile number");
		}
	}
	
	public static boolean PassWord(String password) throws UserCustomException
	{
		Predicate<String> validatePassword = pw -> validate(pw,PASSWORD_PATTERN);
		if(validatePassword.test(password))
		{
			return true;
		}
	    {
			throw new UserCustomException("Invalid password");
	    }
	     
		
	}
	
	public static void main(String[] args) 
	{
		
	}
	

}

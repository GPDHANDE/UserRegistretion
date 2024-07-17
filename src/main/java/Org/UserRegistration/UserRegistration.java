package Org.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	public static boolean FirstName(String name) throws UserCustomException
	{
		String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
		Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
		
		Matcher matcher1 = compiledPattern1.matcher(name);
		
		if(matcher1.matches())
		{
            return true;
        }
		else
        {
           throw new UserCustomException("Invalid first name");
        }
		
		
	}
	
	public static boolean LastName(String name) throws UserCustomException
	{
		String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
		Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
		Matcher matcher2 = compiledPattern2.matcher(name);
		
		if(matcher2.matches())
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
		String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
		
		Pattern compiledPattern3 = Pattern.compile(emailPattern);
		Matcher matcher3 = compiledPattern3.matcher(email);
		
		if(matcher3.matches())
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
		String mobilePattern = "^\\d{2} \\d{10}$";
		Pattern compiledPattern4 = Pattern.compile(mobilePattern);
		Matcher matcher4 = compiledPattern4.matcher(mobileNo);
		
		if(matcher4.matches())
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
		 String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	     String specialCharacterPattern = "[@$!%*?&]";

	     Pattern compiledPattern5 = Pattern.compile(passwordPattern);
	     Pattern specialCharacterCompiledPattern = Pattern.compile(specialCharacterPattern);

	     Matcher matcher5 = compiledPattern5.matcher(password);
	     Matcher specialCharacterMatcher = specialCharacterCompiledPattern.matcher(password);

	     int specialCharacterCount = 0;
	     while(specialCharacterMatcher.find()) 
	     {
	         specialCharacterCount++;
	     }
	     if(matcher5.matches() && specialCharacterCount == 1)
	     {
	    	 return true;
	     }
	     else
	     {
	    	 throw new UserCustomException("Invalid password");
	     }
	     
		
	}
	
	public static void main(String[] args) 
	{
		
	}
	

}

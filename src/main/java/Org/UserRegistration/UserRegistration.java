package Org.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	public static boolean FirstName(String name)
	{
		String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
		Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
		
		Matcher matcher1 = compiledPattern1.matcher(name);
		
		return matcher1.matches();
		
	}
	
	public static boolean LastName(String name)
	{
		String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
		Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
		Matcher matcher2 = compiledPattern2.matcher(name);
		
		return matcher2.matches();
		
	}
	
	public static boolean Email(String email)
	{
		String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
		
		Pattern compiledPattern3 = Pattern.compile(emailPattern);
		Matcher matcher3 = compiledPattern3.matcher(email);
		
		return matcher3.matches();
		
	}
	
	public static boolean MobileNumber(String mobileNo)
	{
		String mobilePattern = "^\\d{2} \\d{10}$";
		Pattern compiledPattern4 = Pattern.compile(mobilePattern);
		Matcher matcher4 = compiledPattern4.matcher(mobileNo);
		
		return matcher4.matches();
		
		
	}
	
	public static boolean PassWord(String password)
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
	     return matcher5.matches() && specialCharacterCount == 1;
	     
		
	}
	
	public static void main(String[] args) 
	{
		
	}
	

}

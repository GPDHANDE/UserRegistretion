package Org.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter first name: ");
//		String firstName = sc.next();
//		String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
//		Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
//		Matcher matcher1 = compiledPattern1.matcher(firstName);
//		
//		if(matcher1.matches()) 
//		{
//			System.out.println("Valid first name.");
//		}
//		else
//		{
//			System.out.println("Invalid first name.");
//		}
//		
//		System.out.println("Enter last name: ");
//		String lastName = sc.next();
//		String lastNamePattern = "^[A-Z][a-zA-Z]{2,}$";
//		Pattern compiledPattern2 = Pattern.compile(lastNamePattern);
//		Matcher matcher2 = compiledPattern2.matcher(lastName);
//		
//		if(matcher2.matches()) 
//		{
//			System.out.println("Valid last name.");
//		}
//		else
//		{
//			System.out.println("Invalid last name.");
//		}
//		
//		System.out.println("Enter the email: ");
//		String email = sc.next();
//		String emailPattern = "^[a-zA-Z0-9._%+-]+\\.[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
//		
//		Pattern compiledPattern3 = Pattern.compile(emailPattern);
//		Matcher matcher3 = compiledPattern3.matcher(email);
//		
//		if(matcher3.matches())
//		{
//			System.out.println("Valid Email.");
//		}
//		else
//		{
//			System.out.println("Invalid Email.");
//		}
		
		System.out.println("Enter the mobile number: ");
		String mobileNo = sc.nextLine();
		String mobilePattern = "^\\d{2} \\d{10}$";
		Pattern compiledPattern4 = Pattern.compile(mobilePattern);
		Matcher matcher4 = compiledPattern4.matcher(mobileNo);
		
		if(matcher4.matches())
		{
			System.out.println("Valid Mobile Number.");
		}
		else
		{
			System.out.println("Invalid Mobile Number.");
		}
	}
	

}

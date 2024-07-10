package Org.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration 
{
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.next();
		String firstNamePattern = "^[A-Z][a-zA-Z]{2,}$";
		Pattern compiledPattern1 = Pattern.compile(firstNamePattern);
		Matcher matcher1 = compiledPattern1.matcher(firstName);
		
		if(matcher1.matches()) 
		{
			System.out.println("Valid first name.");
		}
		else
		{
			System.out.println("Invalid first name.");
		}
	}

}

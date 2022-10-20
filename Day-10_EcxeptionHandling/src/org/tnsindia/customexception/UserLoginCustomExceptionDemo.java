package org.tnsindia.customexception;

import java.util.Scanner;

@SuppressWarnings("serial")
//Custom Exception for validating the Login credentials
class LoginCredentials extends Exception
{
	public String str;

	//constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
}

public class UserLoginCustomExceptionDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Please entre your mail id:");
		String id=s.nextLine();
		System.out.println("Please entre your Password:");
		String password=s.nextLine();
		try {
			if(id!="abc@gmail.com" && password!="abc@123")
				throw new LoginCredentials("Invalid Credentials");
			
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled "+e);
		}
		

	}

}
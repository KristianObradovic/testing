package blackjacktest;

import java.io.IOException;
import java.util.Scanner;

public class Meny {
		Scanner input = new Scanner(System.in);
		String create_username;
		String create_password;
		String tage;
		
		
		public void age() 
		{
		System.out.println("Enter your age : ");		
		
		tage=input.next();
		
		try { 
				int nage =Integer.parseInt(tage);
		
				if(nage>=18) 
				{
					System.out.println("Successful registration");
					to_login();
				}
				else if(nage<18)				
						{
							throw new Exception();
						}

			}		
			catch(Exception e) 
			{
				System.out.println("    +18 ONLY     " );
				//age();  
				System.exit(0);
			}	
		}

	
	
	public void  create_login() {
		
		
			
		//String create_username;
		//String create_password;
		
		
			System.out.println("Please register a Username");
			create_username=input.next();
			System.out.println("Please register a Password");
			create_password=input.next();
	
	}
	
	public void to_login() {
			
			//to_login
		
			String login_username;
			System.out.println("\nEnter your Username");
			login_username=input.next();
			String login_password;
			System.out.println("\nEnter your Password");
			login_password=input.next();
			
			if(create_username.equals(login_username) && create_password.equals(login_password)) 
			{
				System.out.println("    Login Successful     loading 100 %");	
			}
			
			else 
			{
				System.out.println("invalid Username or password");
			}
			
	}
 
		public static void main(String[] args) 
		{
		
			System.out.println("Welcome to    B l a c k - J a c k    Casino ( 18 + ) ");
		
			Meny meny= new Meny();
			meny.create_login();
			System.out.println("Successful registration");
			meny.age();

			
		}
		
  
	
	}

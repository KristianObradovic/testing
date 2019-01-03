package blackjacktest;

//import java.io.IOException;
import java.util.Scanner;

public class Meny {
		Scanner input = new Scanner(System.in);
		String create_username;
		String create_password;
		String tage;
		
		
		public void age() 
		{
		System.out.println("\nEnter your age : ");		
		
		 String tage=input.next();
		
		try { 
				int nage =Integer.parseInt(tage);
		
				if(nage>=18) 
				{
					System.out.println("Successful registration");
					to_login();
				}
				else if(nage<18)				
						{
							
						
							System.out.println("    +18 ONLY     " );
							 
							System.exit(0);
						}

			}		
			catch(Exception e) 
			{
				System.out.println("Numbers Only!");
				age();	
				
				
			}	
		}

	
	
	public void  create_login() {
		
		
			
		//String create_username;
		//String create_password;
		
			
			System.out.println("\nPlease register a Username");
			create_username=input.next();
			System.out.println("\nPlease register a Password");
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
				System.out.println("invalid Username or Password");
				to_login();
			}
			
	}
		public void rules() {
			
			// -----  Header -----------
			System.out.println("\n\n           * * * Rules * * * \n\n");
			System.out.println("Black Jack is played with one deck consisting of 52 cards."
					+ "\nACES can be counted as 1 or 11 points tens and face cards count as ten points."
					+ "\nCards from 2-9 have the same value as shown on the card."
					+ " \nYour goal is to get Black Jack."
					+ "\nBlack Jack is the highest hand and it consists of an ACE and any 10 point card.");
		}
	
	
	
 
		public static void main(String[] args) 
		{
		
			System.out.println("Welcome to    B l a c k - J a c k    Casino ( 18 + ) ");
		
			Meny meny= new Meny();
			meny.create_login();
			System.out.println("Successful registration");
			meny.age();
			meny.rules();

			
		}
		
  
	
	}

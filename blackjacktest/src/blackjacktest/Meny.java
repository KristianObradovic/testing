package blackjacktest;

import java.util.Scanner;



public class Meny {

		
	
		Scanner input = new Scanner(System.in);
		String create_username;
		String create_password;
		
		boolean test =false;
		
		public void age() {
		
		
		
	
		
		System.out.println("enter your age : ");
		
		String tage=input.next();
		
		
		try { int nage =Integer.parseInt(tage);
		
			if(nage>=18) {
				//System.out.println("");
				test = true;
				}
				else if(nage<18)
				System.out.println("Underage");
			}
		
		catch(Exception e) {
			System.out.println("* * * * NUMBERS ONLY * * * * ");
			age(); //  rekursiv metod kap 5 <--|| try catch kapitel 13
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
			
			if(create_username.equals(login_username) && create_password.equals(login_password)) {
				System.out.println("* * * * Login Successful * * * * loading 100 %");
				test=true;
				
				}
			
			else 
				{test=false;
				System.out.println("invalid Username or password");
				}
			
	}
 
		public static void main(String[] args) {
		System.out.println("Welcome to * * * B l a c k - J a c k * * * Casino ( 18 + ) ");
		Meny meny= new Meny();
		meny.age();
		if (meny.test=true) {
			meny.create_login();
			System.out.println("Successful registration");
		}
		
		System.out.println("\n\nGo ahead login");
		
		
		if(meny.test=true) {
			meny.to_login();
			//System.out.println("* * * * Login Successful * * * * loading 100 %");
			
		}
		
			
		}
		
  
	
	}




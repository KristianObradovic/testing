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
				
				test = true;
				
				}
				else if(nage<18)
				System.out.println("Underage"); 
				test=false;
				
		}
		
		catch(Exception e) {
			System.out.println("* * * * NUMBERS ONLY * * * * ");
			age(); //  rekursiv metod kap 5 <--|| try catch kapitel 13
		}
		
	}
	
 
	
	public void alreadyUser() {
		
		
		System.out.println("Press 1 if u have a username. If u dont have press 0");
		String tuser = input.next();
		
		try { int nuser =Integer.parseInt(tuser);
			if(nuser>0) {
				to_login();
				
				
			}
			else if(nuser<1)
				
				System.out.println("\n\nNo account");
				create_login();
		}
		catch (Exception e) {
			System.out.println("Press zero for creating an account or a number greater  then 0 for havin one already");
			alreadyUser();
		}
		
		
	}
	
	
	public void  create_login() {
		
		
		System.out.println("\nPlease register a Username");
		create_username=input.next();
		System.out.println("Please register a Password");
		create_password=input.next();
		System.out.println("* * * Successful registration * * *");
		to_login();
			
	
	}
	
	public void to_login() {
			
			//LOGIN
			
			
			System.out.println("\n\nGo ahead login");
			String n=null;
			String login_username;
			System.out.println("\nEnter your Username");
			login_username=input.next();
			String login_password;
			System.out.println("\nEnter your Password");
			login_password=input.next();
			System.out.println("\n" + "Username : "+ create_username + "\nPassword :"+ create_password);
			
			try {int nullogin=Integer.parseInt(login_username);
				int nullogin2=Integer.parseInt(login_password);
			
			
				
			if (create_username.equals(login_username) && create_password.equals(login_password)) 
			
			{
			
			System.out.println("Login successful");
			//test=true;
			login_successful();
			
			}
			else
				System.out.println("Invalid Username");
				to_login();
			}
		catch(Exception e) {
			//if(create_username==n && create_password==n)
			
			
		}
		
	
	}
	public void login_successful() {
		
		// Spelet är igång
		
		System.out.println("\n * * * G A M E T I M E * * * ");
	
	
	}
 
		public static void main(String[] args) {
		System.out.println("Welcome to * * * B l a c k - J a c k * * * Casino ( 18 + ) ");
		Meny meny= new Meny();
		meny.age();
		if (meny.test=true) {
			meny.alreadyUser();
			
			
		}
			
		if (meny.test=true) {
			
			
			
			
		}
		if (meny.test=true)
			meny.login_successful();
		
		
		
		
	}
		
		
		
		 
		
			
			
		
			
			
			
			
		}
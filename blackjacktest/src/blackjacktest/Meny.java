package blackjacktest;


import java.util.Scanner;

public class Meny {
		
	
		Scanner input = new Scanner(System.in);
		
		String create_username;
		
		String create_password;
		
		String tage;
		
		int chance=0;
		
		boolean approved= false;
		
		
		
		public boolean age() {
		
		System.out.println("\nEnter your age : ");		
		
		 String tage=input.next();
		
		try { 
				int nage =Integer.parseInt(tage);
		
				if( nage >= 18 ) {
					
					approved=true;
					
				}
				else if( nage < 18 ) {
							
						
							System.out.println("    +18 ONLY     " );
							 
							System.exit(0);
				}

			}		
			
		catch ( Exception e ) {
				System.out.println("Numbers Only!");
				age();	
				
				
			}	
			return approved;
		
		
		} // age close bracket

	
	
	
	public void create_login() {
		
	//		* * * Get Username & Password * * *			
			
			System.out.println("\nPlease register a Username");
			create_username=input.next();
			System.out.println("\nPlease register a Password");
			create_password=input.next();
			System.out.println("Successful registration");
			
	}
	
	public boolean to_login() {
			
			
			while ( chance<3 ) {
			
			String login_username;
			
			System.out.println("\nEnter your Username");
			
			login_username=input.next();
			
			String login_password;
			
			System.out.println("\nEnter your Password");
			
			login_password=input.next();
				
			if(create_username.equals(login_username) && create_password.equals(login_password)) { 
			
				System.out.println("    Login Successful     loading 100 %");	
				chance=4;
				approved = true;
				
				
			}
			
			else {
				// * * * Threee Chances * * *
				
				System.out.println("\nInvalid Username OR Password");
				chance++;
				 
				if ( chance == 3 ) {
					System.out.println("\n\nAccess denied! ");
					System.exit(0);
				}
				
				else if( chance == 2 ) {
					System.out.println("\nYOU ONLY HAVE ONE MORE CHANCE");
					
				}
			}
				
		    }//While loop close brackets
				
				return approved;
				


	}//to_login()
	
		
	
		public void rules() {
			
			// -----  Header -----------
			
			System.out.println("\n\n           * * * Rules * * * \n\n");
			System.out.println("Black Jack is played with one deck consisting of 52 cards."
					+ "\nACES can be counted as 1 or 11 points. Tens and face cards count as ten points."
					+ "\nCards from 2-9 have the value as the number shown on each of the cards."
					+ "\nSo if User gets a card showing 2 then its 2 points" 
					+ " \nYour goal is to beat the Dealers hand."
					+ "\nIt means that your end goal is to have the highest score"
					+ "\n21 points its the best hand you can get"
					+ "\nTo be able to get 21 points you need to have a hand that consists of an ACE and any 10 point card."
					+ "\nYou can always ask the dealer for more cards as long as you under 21 points."
					+ "\nIf you get more then 21 points you will loose");
		
		} // rules close bracket
	
	
	
 
		public static void main(String[] args) {
		
			System.out.println("Welcome to    B l a c k - J a c k    Casino ( 18 + ) ");
		
			Meny meny = new Meny();
			
			meny.age();
			
			if(meny.approved=true){
			
				meny.create_login();
			}
			
			
			
			meny.to_login();
			if( meny.approved=true ) {
				
				meny.rules();
			
			}
			
			
			
			
		} // main close bracket
		
  
	
} // Meny class close bracket

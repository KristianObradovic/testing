package blackjacktest;



public class Game {

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
	
}

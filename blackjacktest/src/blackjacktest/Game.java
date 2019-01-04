package blackjacktest;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Meny meny= new Meny();
		CardDeck cd = new CardDeck();
		Scanner inp = new Scanner(System.in);
		
		boolean menu = true;
		System.out.println("Welcome to    B l a c k - J a c k    Casino ( 18 + ) ");
		while(menu);
		meny.age();
		if(meny.approved=true)
		
		
		System.out.println("What would you like to do?/n[1] Log in/n[2] Create user");
		String logchoice = inp.next();
		
		try {
			int ichoice = Integer.parseInt(logchoice);
			if (ichoice == 1)
				meny.to_login();
				
			else if (ichoice == 2)
				meny.create_login();
				
			else
			System.out.println("Invalid number. Plase try again");
			}
		catch (Exception e) {
			System.out.println("Choice out of range. Plase try again");
		}
		
	}

}

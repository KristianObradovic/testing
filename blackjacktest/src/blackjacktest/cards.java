package blackjacktest;

public class cards { 
	private final int suit;
	private final int value;

	public final static int Hearts = 0,
							Diamonds = 1,
							Cloves = 2,
							Spades = 3;
	
	public final static int Ace = 1,
							Jack = 11,
							Queen = 12,
							King = 13;
	
	public cards(int setValue, int setSuit) {
		value = setValue;
		suit = setSuit;
	} 
	
	public int getSuit() {
		return suit;
	}
	
	public String stringSuit() {
		switch(suit) {
		case Hearts: return "Hearts";
		case Diamonds: return "Diamon";
		case Cloves: return "Cloves";
		case Spades: return "Spades";
		default: return "error";
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public String stringValue() {
		switch(value) {
		case 1: return "Ace";
		case 2: return "2";
		case 3: return "3";
		case 4: return "4";
		case 5: return "5";
		case 6: return "6";
		case 7: return "7";
		case 8: return "8";
		case 9: return "9";
		case 10: return "10";
		case 11: return "Jack";
		case 12: return "Queen";
		case 13: return "King";
		default: return "error";
		}
	}
	
	public String asString() {
		return stringValue() + "of" + stringSuit();
	}

}

	                    
	


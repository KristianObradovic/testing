package blackjacktest;

public class CardDeck {

		private cards[] deck;   // An array for the cards in the deck
	    private int dealtcards; // How many cards have been dealt from the deck
	    
	    public void Deck() {	
	       deck = new cards[52];
	       int cardscount = 0; 
	       for ( int suit = 0; suit <= 3; suit++ ) {
	          for ( int value = 1; value <= 13; value++ ) {
	             deck[cardscount] = new cards(value,suit);
	             cardscount++;
	          }
	       }
	       dealtcards = 0;
	    }
	    
	    public cards newCard() {	// Deals one card from the deck and returns it.
	        if (dealtcards == 52)	
	           shuffle();
	        dealtcards++;
	        return deck[dealtcards - 1];
	    }
	    
	    public void shuffle() {		// A shuffle method so the cards are in random order
	        for ( int i = 51; i > 0; i-- ) {
	            int random = (int)(Math.random()*(i+1));
	            cards value = deck[i];
	            deck[i] = deck[random];
	            deck[random] = value;
	        }
	        dealtcards = 0;
	    }	    
}



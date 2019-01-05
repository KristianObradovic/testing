package blackjacktest;

import java.util.Random;

public class Deck {
    private cards[] cards = new cards[52];
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    public Deck(){
        reset();
    }
    
    public int rCard(){	//get a random value between 0 and 51
        Random rand = new Random();
        int value = rand.nextInt(52);
        return value;
    }

    public void shuffle(){	// Shuffle the deck
        for (int i = 0; i < cards.length; i++) {
            int index = rCard();
            cards var = cards[i];
            cards[i] = cards[index];
            cards[index] = var;
        }
    }

    public cards dealCard(){
        cards fCard = cards[0];

        int index = 1;
        cards current = fCard;

        while(current != null && index <= 51){
            current = cards[index];
            cards[index - 1] = current;
            index++;
        }
        cards[index - 1] = null;

        return fCard;
    }

    public void reset(){
        int index = 0;
        for(String suit: suits){
            for(String name: names){
                cards myCard = new cards(name, suit);
                cards[index] = myCard;
                index++;
            }
        }
    }

    public String toString(){
        StringBuilder cardText = new StringBuilder();
        for(cards card: cards){
            if(card != null){
                cardText.append(card.toString());
                cardText.append(" ");
            }
        }
        return cardText.toString();
    }

    public int rNum(int min, int max) {
        Random rand = new Random();

        // nextInt is normally exclusive of the top value, so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
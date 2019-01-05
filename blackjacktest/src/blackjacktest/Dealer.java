package blackjacktest;

public class Dealer {
    private Deck deck = new Deck();
    private Hand hand = new Hand();
 
    
    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public Dealer(){
        deck.shuffle();
    }

    public cards dealCard(){
        return deck.dealCard();
        }

    public void dealHands(Player player){
        hand.add(dealCard());
        hand.add(dealCard());
        player.getHand().add(dealCard());
        player.getHand().add(dealCard());
        }

}
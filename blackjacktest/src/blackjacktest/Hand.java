package blackjacktest;

public class Hand {
    private cards[] hand = new cards[11];

    public void add(cards card){
        for(int i = 0; i < hand.length; i++){
            if(hand[i] == null){
                hand[i] = card;
                break;
            }
        }
    }

    public cards get(int index){
        cards card = null;
        if(index >= 0 && index < hand.length){
            card = hand[index];
        }
        return card;
    }

    public int getScore(){  // Get score and check if Ace is 1 or 11
        int value = 0;
        int aces = 0;

        for(cards ace: hand){
            if(ace != null){
                if(ace.getName().equals("Ace")){
                    aces++;
                }
                value += ace.getValue();
            }
            else{
                break;
            }
        }

        if(value >  21){
            while(aces > 0){
                value -= 10;
                aces--;
            }
        }

        return value;
    }

    public String hiddenHand(){  // Dealers hidden hand
        return hand[0].getName() + " Hidden";
    }

    public boolean isBlackjack(){  // Blackjack check
        if ( hand[0].getValue() + hand[1].getValue() == Game.blackJack){
            return true;
        }

        return false;
    }

    public boolean bust(){ // Over 21 check
        boolean bust = false;

        if(getScore() >  Game.blackJack){
            bust = true;
        }
        return bust;
    }

    public String toString(){
        StringBuilder handText = new StringBuilder();
        for(cards c: hand){
            if(c != null){
                handText.append(c.getName() + " ");
            }
            else{
                break;
            }
        }

        return handText.toString();
    }

    public void clear(){
        hand = new cards[11];
    }

}


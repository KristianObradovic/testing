package blackjacktest;

public class cards {

    private String name;
    private String suit;

    public cards(String initialName, String initialSuit) {
        name = initialName;
        suit = initialSuit;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String newSuit) {
        suit = newSuit;
    }

    public int getValue() {  // all the possible values
        int value = 0;

        if(name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5")
                || name.equals("6") || name.equals("7") || name.equals("8") || name.equals("9") || name.equals("10")
        ) {
            value = Integer.parseInt(name); //convert the string to integer
        }
        else if(name.equals("King") || name.equals("Queen") || name.equals("Jack") ){
            value = 10;
        }
        else if(name.equals("Ace")){
            value = 11;
        }

        return value;
    }

    public String toString() { // return the card
        return name + " of " +  suit;
    }
}

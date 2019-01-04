import java.util.ArrayList;

public class Player {

    private final String nickname;

    private final ArrayList<Card> hand;

    public Player(String nickname) {
        this.nickname = nickname;
        this.hand = new ArrayList<Card>();
    }

    public String getNickname() {
        return nickname;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandSum() {
        int handSum = 0;
        for (Card card : hand) {
            handSum += card.getFace().getValue();
        }
        return handSum;
    }

    public String getHandAsString(boolean hideCard) {
        StringBuilder sb = new StringBuilder();
        sb.append(nickname + "\'s current hand:");
        sb.append('\n');
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && hideCard) {
                sb.append("[Hidden card]");
                sb.append('\n');
            } else {
                sb.append(hand.get(i));
                sb.append('\n');
            }
        }
        return sb.toString();
    }

}

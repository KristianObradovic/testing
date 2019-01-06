package blackjacktest;

public class Player {
	Database db = new Database();
	public String name = "Player";
	private Hand hand = new Hand();

	public Player() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 0)
			this.name = name;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
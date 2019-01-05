package blackjacktest;

public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database database= new Database();
		database.dbsql();
		Game game = new Game();
		game.play();
	}
}
